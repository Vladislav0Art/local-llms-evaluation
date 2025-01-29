package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestConnectWithCookieAndReferrer {

    private HttpConnection connection;

    @BeforeEach
    public void init() {
        connection = new HttpConnection();
    }

    @Test
    public void testConnectWithCookieAndReferrer() throws Exception {
        Connection.Request request = new Request();
        request.setUrl("https://example.com");
        request.setCookie("test=cookie").setReferrer("http://example.org");
        assertEquals(200, HttpConnection.connect(request).execute().getResponseCode());
    }

}