package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

public class GeneratedHeadersWithMapTest {

    @Test
    public void headersWithMapTest() {
        Map<String, String> headersMap = new HashMap<>();
        headersMap.put("Content-Type", "application/xml");
        Connection connection = new HttpConnection().headers(headersMap);
        assertNotNull(connection);
    }

}