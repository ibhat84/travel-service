# travel-service

This is a travel service backend application for customers to search for 
flights, view results, and book air tickets.
Users are required to create an account prior to booking the tickets.

Tech Stack :
Java Spring Boot RestAPI Microservices backend 
OpenAPI Swagger

End Points:
POST
http://localhost:8082/api/auth/register
http://localhost:8082/api/flights
http://localhost:8082/api/bookings/book?userId=1&flightId=1
GET
http://localhost:8082/api/flights/search?departure=NYC&destination=LA

OpenAPI Documentation:
http://localhost:8082/swagger-ui/index.html








