# Spring Boot - Java 17 Proof of Concept
This GitHub repo is a proof of concept in which we do the following:

1. Enter from the controller.
2. We then proceed to call the service from the controller.
3. The service calls the web client to make the retrieval of data.
4. We get the data back from the downstream API.
5. We mold the data into a model. This is not a needed step for a simple API, but the proof of concepts stands if there is a need to adjust the final call. 
6. We mold our model back into a data transfer object.
7. We return the remolded data back to the user.

## Future POC Additions
- [x] Logging 
- [x] Custom Error Handling
- [ ] Groovy / Spock Tests 
- [ ] Swagger Documentation 
 
## Additional Notes
- I added Lombok to this project for the ease of reading through the "possibly" massive data transfer objects and models.
