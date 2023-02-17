package edu.eci.arep.Apps;

import edu.eci.arep.Services.HTMLSparkPOSTService;
import edu.eci.arep.Services.HTMLSparkService;
import edu.eci.arep.Services.SparkJsonService;

import java.io.IOException;

import static edu.eci.arep.Apps.HttpServer.*;

public class FirstApp {
    public static void main(String args[]) throws IOException {
        HttpServer server = HttpServer.getInstance();
        String aplicationJson;

        //Agregar servicios con funciones lambda

        //tipo get
        get("/spark", (request) -> new HTMLSparkService().getResponse(request));
        //tipo post

        post("/post", (request) -> new HTMLSparkPOSTService().getResponse(request));

        get("/json", (request) -> new SparkJsonService().getResponse(request), "application/json");



        server.run(args);
    }




}
