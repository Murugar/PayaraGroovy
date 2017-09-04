package com.iqmsoft.payara.groovy

import javax.json.Json
import javax.json.JsonObject
import javax.ws.rs.*
import javax.ws.rs.core.*

@ApplicationPath("api")
class TestApp extends Application{

}

@Path("test")
class TestResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    def JsonObject hello(@QueryParam("name") String name){
        return Json.createObjectBuilder()
            .add("msg", "Test Payara Groovy " + name)
            .build()
    }
}