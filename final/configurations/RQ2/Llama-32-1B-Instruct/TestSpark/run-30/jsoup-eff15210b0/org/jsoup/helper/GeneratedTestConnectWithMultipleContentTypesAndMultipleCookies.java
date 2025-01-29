package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestConnectWithMultipleContentTypesAndMultipleCookies {

    private HttpConnection connection;

    @BeforeEach
    public void init() {
        connection = new HttpConnection();
    }

    @Test
    public void testConnectWithMultipleContentTypesAndMultipleCookies() throws Exception {
        Connection.Request request = new Request();
        request.setUrl("https://example.com").setContentType("application/x-www-form-urlencoded").setCookie("test1=cookie1").setCookie("test2=cookie2");
        assertEquals(200, HttpConnection.connect(request).execute().getResponseCode());
    }

}