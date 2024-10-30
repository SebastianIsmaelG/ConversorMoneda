
# Conversor de Divisas 🪙

Hola! mi nombre es Sebastian Gutierrez y como parte de la formacion Java de Alura Latam hemos desarrollado un proyecto sobre la taza de conversion de divisas.


## Demostracion de la interfaz de usuario

<img src="https://i.ibb.co/Bs4hYJX/Captura-de-pantalla-2024-10-30-181913.png" alt="Captura-de-pantalla-2024-10-30-181913" border="0">


## Uso de biblioteca gson

Para el desarollo de este proyecto se hizo uso de la biblioteca gson en su version 2.11.0. Este nos permite convertir un Object de Java a su representacion JSON, pudiendo manipular datos de la API con facilidad.

Puedes descargarlo desde el siguiente enlace
https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0




## Uso de ExchangeRate-API

#### Ejemplo GET request

```http
  GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `YOUR-API-KEY` | `string` | **Unico**. tu API key |
| `USD` | `string` | Divisa (USD) |

#### Ejemplo Convertir Divisas

```http
 GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/EUR/GBP
```

Retorna la taza de conversion de EUR a GBP


## Instalacion

Puedes descargar este proyecto y usarlo localmente desde el siguiente enlace
https://github.com/SebastianIsmaelG/ConversorMoneda/archive/refs/heads/main.zip

O utilizando la consola de comandos
```bash
  git clone https://github.com/SebastianIsmaelG/ConversorMoneda.git
```
    
