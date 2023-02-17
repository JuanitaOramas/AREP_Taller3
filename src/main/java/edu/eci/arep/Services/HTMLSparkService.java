package edu.eci.arep.Services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HTMLSparkService implements SparkService {
    private String httpResponse;


    @Override
    public String getResponse(String request) {

        httpResponse = "HTTP/1.1 200 OK\n" +
                "Content-Type: text/html; charset=utf-8\n" +
                "\n" + "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<title>Hola ! esta es mi pagina</title>\n" +
                "</head>\n" +
                "<body>\n" + "\tContenido de la página.\n" + "</body>\n" + "</html>\n";

        byte[] fileContent;
        try {
            fileContent = Files.readAllBytes(Paths.get("src/main/resources/index.html"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new String(httpResponse);
    }

}


