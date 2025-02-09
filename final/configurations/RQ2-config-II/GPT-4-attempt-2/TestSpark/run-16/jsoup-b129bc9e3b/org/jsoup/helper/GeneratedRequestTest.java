package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedRequestTest {

    @Test
    public void requestTest() {
        HttpConnection con = new HttpConnection();
        Connection.Request reqMock = mock(Connection.Request.class);
        when(reqMock.url()).thenReturn(new URL("https://www.example.com"));
        con.request(reqMock);
        assertEquals("https://www.example.com", con.request().url().toString());
    }

}