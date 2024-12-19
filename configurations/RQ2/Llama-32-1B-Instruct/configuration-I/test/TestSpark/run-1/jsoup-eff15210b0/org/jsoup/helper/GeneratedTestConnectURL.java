package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

public class GeneratedTestConnectURL {

    @Test
    public void testConnectURL() {
        HttpConnection connection = new HttpConnection();
        String url = "https://www.example.com";
        System.out.println(connection.connect(url));
    }

}