package org.jsoup.helper;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTestConnectSuccess {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    public String connect(String url) {
        try (BufferedWriter writer = new BufferedWriter(outContent)) {
            writer.write("GET " + url + " HTTP/1.1\r\n");
            writer.write("\r\n");
            return outContent.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getCookie() throws IOException {
        return "";
    }

    @Test
    public void testConnectSuccess() {
        MyMocking mocking = new MyMocking();
        String url = "http://localhost:8080";
        String cookie = "mock_cookie";

        String response = mocking.connect(url);
        System.out.println(response);

        assertEquals("HTTP/1.1 200 OK\r\nContent-Type: text/html; charset=utf-8\r\n\r\n<html><head><title>OK</title></head><body><h1>Welcome to the mock server!</h1></body></html>", response, "Mock Server Response");
    }

}