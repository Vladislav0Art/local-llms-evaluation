package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedConnectStringTest {

    @Test
    public void connectStringTest() throws MalformedURLException {
        Connection connection = HttpConnection.connect("https://example.com");
        assertNotNull(connection);
        assertEquals(new URL("https://example.com"), connection.request().url());
    }

}