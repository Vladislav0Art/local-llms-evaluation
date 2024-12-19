package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testConnect() {
        HttpConnection connection = new HttpConnection();
        System.out.println(connection.connect("https://www.example.com"));
    }

    @Test
    public void testConnectURL() {
        HttpConnection connection = new HttpConnection();
        String url = "https://www.example.com";
        System.out.println(connection.connect(url));
    }

    @Test
    public void testHttpConnection() {
        HttpConnection connection = new HttpConnection();
        Request request = new Request();
        connection.newRequest(request);
        System.out.println(connection.url("https://www.example.com"));
    }

    @Test
    public void testGetResponse() throws IOException {
        HttpConnection connection = new HttpConnection();
        Request request = new Request();
        Connection response = connection.request(request);
        Document document = response.get();
        System.out.println(document.toString());
    }

    @Test
    public void testPostRequest() throws IOException {
        HttpConnection connection = new HttpConnection();
        Request request = new Request();
        Connection response = connection.post(request);
        Document document = response.get();
        System.out.println(document.toString());
    }

}