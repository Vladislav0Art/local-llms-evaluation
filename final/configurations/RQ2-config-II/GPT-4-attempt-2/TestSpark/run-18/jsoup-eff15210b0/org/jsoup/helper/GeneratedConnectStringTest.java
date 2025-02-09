package org.jsoup.helper;

import org.jsoup.Connection.Method;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

public class GeneratedConnectStringTest {

    @Test
    public void connectStringTest() throws MalformedURLException {
        assertNotNull(HttpConnection.connect("http://example.com"));
    }

}