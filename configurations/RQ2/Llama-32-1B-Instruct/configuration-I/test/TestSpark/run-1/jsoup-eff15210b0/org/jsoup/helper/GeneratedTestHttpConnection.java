package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

public class GeneratedTestHttpConnection {

    @Test
    public void testHttpConnection() {
        HttpConnection connection = new HttpConnection();
        Request request = new Request();
        connection.newRequest(request);
        System.out.println(connection.url("https://www.example.com"));
    }

}