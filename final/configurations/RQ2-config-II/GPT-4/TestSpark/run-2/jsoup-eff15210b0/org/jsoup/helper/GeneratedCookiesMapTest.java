package org.jsoup.helper;

import org.jsoup.Connection.Method;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedCookiesMapTest {

    @Test
    public void cookiesMapTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> cookies = Mockito.mock(Map.class);
        assertEquals(connection.cookies(cookies).request().cookies(), cookies);
    }

}