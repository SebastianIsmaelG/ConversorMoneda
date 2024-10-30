package modules;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestApi {

    //Your API Key:
    String url = "https://v6.exchangerate-api.com/v6/API_LEY/pair/";

    public RequestDatos seleccionMoneda(String monedaBase, String monedaCambio, double montoConvertir){

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest peticion = HttpRequest.newBuilder().uri(URI.create(url + monedaBase + "/" + monedaCambio + "/" + montoConvertir)).build();
        try {
            HttpResponse<String> respuesta = cliente.send(peticion, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(respuesta.body(),RequestDatos.class);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }




}
