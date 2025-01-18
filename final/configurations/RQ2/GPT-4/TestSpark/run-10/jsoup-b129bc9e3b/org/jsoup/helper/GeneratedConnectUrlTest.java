package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedConnectUrlTest {

    @Mock
    InputStream stream;

    public HttpConnectionTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void connectUrlTest() throws MalformedURLException {
        Connection result = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(result);
    }

}