package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.InputStream;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedProxyUrlPortTest {

    @Mock
    private URL mockUrl;

    @Mock
    private Proxy mockProxy;

    @Mock
    private CookieStore mockCookieStore;

    @Mock
    private Parser mockParser;

    @Mock
    private InputStream mockInputStream;

    private Map<String, String> data = new HashMap<>();

    @Test
    public void proxyUrlPortTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.proxy(mockUrl.getHost(), mockUrl.getDefaultPort());
        assertNotNull(httpConnection.request().proxy());
    }

}