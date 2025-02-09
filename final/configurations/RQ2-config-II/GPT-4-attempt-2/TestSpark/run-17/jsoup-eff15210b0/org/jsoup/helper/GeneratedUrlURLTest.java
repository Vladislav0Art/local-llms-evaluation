package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedUrlURLTest {

    @Test
    public void urlURLTest() throws Exception {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.url(new URL("http://example.com"));
        assertNotNull(connection);
    }

}