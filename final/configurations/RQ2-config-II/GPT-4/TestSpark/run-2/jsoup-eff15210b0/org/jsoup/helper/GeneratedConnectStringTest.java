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

public class GeneratedConnectStringTest {

    @Test
    public void connectStringTest() throws MalformedURLException {
        String url = "http://www.example.com";
        assertEquals(HttpConnection.connect(url).request().url(), new URL(url));
    }

}