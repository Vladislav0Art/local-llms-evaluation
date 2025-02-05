package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedResponseTest {

    @Test
    public void responseTest() {
        HttpConnection connection = new HttpConnection();
        Connection.Response response = mock(Connection.Response.class);
        connection.response(response);
        assertEquals(response, connection.response());
    }

}