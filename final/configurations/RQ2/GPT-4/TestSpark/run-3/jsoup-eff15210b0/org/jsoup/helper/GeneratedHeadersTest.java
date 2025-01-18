package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedHeadersTest {

    @Test
    public void headersTest() {
        Connection connection = new HttpConnection();
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("header1", "value1");
        headers.put("header2", "value2");
        connection.headers(headers);
        assertEquals(headers, connection.request().headers());
    }

}