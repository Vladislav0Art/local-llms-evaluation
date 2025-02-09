package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedProxyStringTest {

    @Test
    public void proxyStringTest() {
        HttpConnection httpConnection = new HttpConnection();
        Proxy proxy = httpConnection.proxy("127.0.0.1", 8888).request().proxy();
        assertNotNull(proxy);
    }

}