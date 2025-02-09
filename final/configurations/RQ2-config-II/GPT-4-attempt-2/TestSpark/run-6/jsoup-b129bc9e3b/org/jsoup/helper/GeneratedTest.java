package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Parser;
import org.junit.Test;

import java.io.InputStream;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void urlTest() throws MalformedURLException {
        HttpConnection httpConnection = new HttpConnection();

        Connection conn = httpConnection.url(new URL("http://example.com"));
        assertNotNull(conn);
    }

    @Test
    public void urlInvalidUrlTest() throws MalformedURLException {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("invalid-url");
    }

    @Test
    public void userAgentTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.userAgent("Mozilla/5.0");

        assertEquals("Mozilla/5.0", httpConnection.request().header("User-Agent"));
    }

    @Test
    public void dataStringStringTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data("key", "value");

        assertEquals("value", httpConnection.request().data().get(0).value());
    }

    @Test
    public void cookieTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.cookie("name", "value");

        assertEquals("value", httpConnection.request().cookies().get("name"));
    }

    @Test
    public void requestTest() {
        HttpConnection httpConnection = new HttpConnection();

        assertNotNull(httpConnection.request());
    }

    @Test
    public void requestConnectionRequestTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection.Request request = new Connection.Request();

        assertEquals(request, httpConnection.request(request).request());
    }

    @Test
    public void responseTest() {
        HttpConnection httpConnection = new HttpConnection();

        assertNotNull(httpConnection.response());
    }

}