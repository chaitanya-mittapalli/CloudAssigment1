This REST API Service Will take a input as a number and will return the output Whether the number in prime or not and the logarithmic value of the number.

URL

54.244.144.50:8080/CloudProject/api/prime

Method:

GET
POST

URL Params

Required:

name=[String]
number=[integer]

Success Response:

Code: HTTP 200 
Request: 54.244.144.50:8080/CloudProject/api/prime?number=11&name=Michael Bloom
Response: 
{
  "LogValue": 2.3978952727983707,
  "Result": "Number is Prime",
  "Number": 11,
  "UserName": "Michael Bloom"
}

