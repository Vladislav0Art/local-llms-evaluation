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

public class GeneratedCookiesWithMapTest {

    @Test
    public void cookiesWithMapTest() {
        Map<String, String> cookiesMap = new HashMap<>();
        cookiesMap.put("JSESSIONID", "1234567890");
        Connection connection = new HttpConnection().cookies(cookiesMap);
        assertNotNull(connection);
    }

}