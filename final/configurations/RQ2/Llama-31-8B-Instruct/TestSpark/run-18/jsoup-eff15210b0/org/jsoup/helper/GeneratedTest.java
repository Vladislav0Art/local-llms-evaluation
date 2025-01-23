package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private HttpConnection httpConnection;

    @Test
    public void connect_StringTest() {
        String url = "https://www.example.com";
        try {
            Connection connection = HttpConnection.connect(url);
            assertNotNull(connection);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void connect_URLTest() {
        try {
            URL url = new URL("https://www.example.com");
            Connection connection = HttpConnection.connect(url);
            assertNotNull(connection);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void newRequestTest() {
        Connection connection = httpConnection.newRequest();
        assertNotNull(connection);
    }

    @Test
    public void url_URLTest() {
        try {
            URL url = new URL("https://www.example.com");
            Connection connection = httpConnection.url(url);
            assertNotNull(connection);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void url_StringTest() {
        String url = "https://www.example.com";
        try {
            Connection connection = httpConnection.url(url);
            assertNotNull(connection);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void proxy_ProxyTest() {
        java.net.Proxy proxy = java.net.Proxy.NO_PROXY;
        Connection connection = httpConnection.proxy(proxy);
        assertNotNull(connection);
    }

}