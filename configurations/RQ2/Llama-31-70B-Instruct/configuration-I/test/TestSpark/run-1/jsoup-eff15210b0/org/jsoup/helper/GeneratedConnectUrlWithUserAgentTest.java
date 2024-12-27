package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConnectUrlWithUserAgentTest {

    @Test
    public void connectUrlWithUserAgentTest() {
        HttpConnection connection = HttpConnection.connect("https://www.example.com")
                .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
        assertNotNull(connection);
    }

}