package edu.eci.arep.Services;

public class SparkJsonService implements SparkService {
    private String jsonResponse;

    @Override
    public String getResponse(String request) {

        String jsonResponse = "HTTP/1.1 200 OK\r\n" +
                "Content-Type: application/json \r\n" +
                "\r\n";    return jsonResponse +
                "{\"message\":\"Esto es con json siii\"}";

    }
}
