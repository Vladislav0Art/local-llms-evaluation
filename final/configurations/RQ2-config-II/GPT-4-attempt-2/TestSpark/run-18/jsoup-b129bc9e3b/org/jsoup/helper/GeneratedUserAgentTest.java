package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedUserAgentTest {

    @Test
    public void userAgentTest() {
        String userAgent = "Mozilla/5.0";
        HttpConnection connection = new HttpConnection();
        connection.userAgent(userAgent);
        assertEquals(userAgent, connection.request().userAgent());
    }

}