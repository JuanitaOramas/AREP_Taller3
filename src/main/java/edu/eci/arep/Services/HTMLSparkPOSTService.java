package edu.eci.arep.Services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HTMLSparkPOSTService implements SparkService{
    private String httpHeaderResponse;
    private String serverData;


    @Override
    public String getResponse(String request) {

        httpHeaderResponse = "HTTP/1.1 200 OK\n" +
                "Content-Type: text/html; charset=utf-8\n" +
                "\n" ;

        byte[] fileContent;
        try {
            fileContent = Files.readAllBytes(Paths.get("src/main/resources/index.html"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("hello "+request);
        // Se obtienen los datos para luego ser tratada.
        serverData = request;
        return  httpHeaderResponse + new String(fileContent);
    }


}
