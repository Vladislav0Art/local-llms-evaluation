package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestConnectWithMultipleHeaders {

    private HttpConnection connection;

    @BeforeEach
    public void init() {
        connection = new HttpConnection();
    }

    @Test
    public void testConnectWithMultipleHeaders() throws Exception {
        Connection.Request request = new Request();
        request.setUrl("https://example.com").addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        request.addHeader("Accept-Charset", "utf-8");
        assertEquals(200, HttpConnection.connect(request).execute().getResponseCode());
    }

}