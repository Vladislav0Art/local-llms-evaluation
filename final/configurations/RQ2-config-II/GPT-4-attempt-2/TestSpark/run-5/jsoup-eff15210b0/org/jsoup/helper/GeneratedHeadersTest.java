package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedHeadersTest {

    @Test
    public void headersTest() {
        HttpConnection httpConnection = new HttpConnection();

        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Authorization", "Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==");

        httpConnection.headers(headers);

        assertEquals("application/json", httpConnection.request().headers().get("Content-Type"));
        assertEquals("Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==", httpConnection.request().headers().get("Authorization"));
    }

}