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
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private HttpConnection httpConnection;

    @Spy
    private Connection.Request request;

    @Test
    public void connect_StringTest() {
        String url = "https://www.example.com";
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

    @Test
    public void connect_URLTest() {
        URL url = new URL("https://www.example.com");
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

    @Test
    public void newRequestTest() {
        Connection connection = httpConnection.newRequest();
        assertNotNull(connection);
    }

    @Test
    public void url_StringTest() {
        String url = "https://www.example.com";
        Connection connection = httpConnection.url(url);
        assertNotNull(connection);
    }

    @Test
    public void url_URLTest() {
        URL url = new URL("https://www.example.com");
        Connection connection = httpConnection.url(url);
        assertNotNull(connection);
    }

}