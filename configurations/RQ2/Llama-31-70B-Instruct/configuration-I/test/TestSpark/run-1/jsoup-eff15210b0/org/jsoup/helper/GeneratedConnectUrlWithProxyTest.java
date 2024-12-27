package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConnectUrlWithProxyTest {

    @Test
    public void connectUrlWithProxyTest() {
        HttpConnection connection = HttpConnection.connect("https://www.example.com")
                .proxy("127.0.0.1", 8080);
        assertNotNull(connection);
    }

}