package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedHeadersTest {

    @Test
    public void headersTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> headers = new HashMap<>();
        headers.put("name", "value");
        Connection connection = httpConnection.headers(headers);
        assertNotNull(connection);
    }

}