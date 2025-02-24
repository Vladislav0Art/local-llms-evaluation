package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestUserAgent {

    @Test
    public void testUserAgent() {
        HttpConnection connection = new HttpConnection();
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.193 Safari/537.36";
        connection.userAgent(userAgent);
        assertEquals(userAgent, connection.request().header("User-Agent"));
    }

}