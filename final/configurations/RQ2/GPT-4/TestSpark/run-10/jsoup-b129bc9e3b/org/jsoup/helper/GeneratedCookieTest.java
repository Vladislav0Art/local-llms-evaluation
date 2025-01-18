package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedCookieTest {

    @Mock
    InputStream mockedInputStream;

    public HttpConnectionTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void cookieTest() {
        HttpConnection connection = new HttpConnection();
        Connection result = connection.cookie("name", "value");
        assertEquals(connection, result);
    }

}