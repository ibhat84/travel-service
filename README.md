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

Docker and Containerization
Dockerfile in the application path builds the application and creates the docker image.
The docker image is tagged and pushed to remote docker hub container registry. 
[Prerequisite : Install docker on your local machine. 
On cmd line check : docker --version 
Create a repo on the docker hub to push your images.
]
docker build -t travel-service .
docker image tag travel-service ibhat84/travel-service:latest
docker image push ibhat84/travel-service:latest

RedHat OpenShift Deployments
-webapp.yml -> contains deployment and service yml configurations.
On the Openshift console, we need to add routes to expose the service externally.
Name : travel-service-route
Service : travel-service
Target Port : 8082-8082 (tcp)
Path: Leave it blank 
(Path is Optional --If you leave it blank, just add your context path in the browser while testing
For Eg with a swagger ui : http://<openshift-endpoint>/swagger-ui/index.html)
(In Postman, http://<openshift-endpoint>/api/auth/register)
[Also please note, http , not https]











