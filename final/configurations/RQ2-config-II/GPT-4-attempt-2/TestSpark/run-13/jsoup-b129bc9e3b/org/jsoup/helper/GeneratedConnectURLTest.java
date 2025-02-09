package org.jsoup.helper;

import org.jsoup.Connection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedConnectURLTest {

    @Test
    public void connectURLTest() throws IOException {
        assertEquals(HttpConnection.class, HttpConnection.connect(new URL("http://example.com")).getClass());
    }

}