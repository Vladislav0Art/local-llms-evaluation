package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    private HttpConnection connection;

    @BeforeEach
    public void init() {
        connection = new HttpConnection();
    }

    @Test
    public void testConnect() throws Exception {
        connection.connect("https://example.com");
        assertNotNull(connection);
    }

    @Test
    public void testConnectWithCookie() throws Exception {
        Connection.Request request = new Request();
        request.setUrl("https://example.com").setCookie("test=cookie");
        assertEquals(200, HttpConnection.connect(request).execute().getResponseCode());
    }

    @Test
    public void testConnectWithCookieAndReferrer() throws Exception {
        Connection.Request request = new Request();
        request.setUrl("https://example.com");
        request.setCookie("test=cookie").setReferrer("http://example.org");
        assertEquals(200, HttpConnection.connect(request).execute().getResponseCode());
    }

    @Test
    public void testConnectWithMultipleCookies() throws Exception {
        Connection.Request request = new Request();
        request.setUrl("https://example.com").setCookie("test1=cookie1").setCookie("test2=cookie2");
        assertEquals(200, HttpConnection.connect(request).execute().getResponseCode());
    }

    @Test
    public void testConnectWithReferrerAndMultipleCookies() throws Exception {
        Connection.Request request = new Request();
        request.setUrl("https://example.com").setReferrer("http://example.org");
        request.setCookie("test1=cookie1").setCookie("test2=cookie2");
        assertEquals(200, HttpConnection.connect(request).execute().getResponseCode());
    }

    @Test
    public void testConnectWithMultipleContentTypes() throws Exception {
        Connection.Request request = new Request();
        request.setUrl("https://example.com").setContentType("application/x-www-form-urlencoded");
        request.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        assertEquals(200, HttpConnection.connect(request).execute().getResponseCode());
    }

    @Test
    public void testConnectWithMultipleContentTypesAndReferrer() throws Exception {
        Connection.Request request = new Request();
        request.setUrl("https://example.com").setContentType("application/x-www-form-urlencoded");
        request.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        request.setReferrer("http://example.org");
        assertEquals(200, HttpConnection.connect(request).execute().getResponseCode());
    }

    @Test
    public void testConnectWithMultipleContentTypesAndCookies() throws Exception {
        Connection.Request request = new Request();
        request.setUrl("https://example.com").setContentType("application/x-www-form-urlencoded");
        request.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        request.setCookie("test1=cookie1").setCookie("test2=cookie2");
        assertEquals(200, HttpConnection.connect(request).execute().getResponseCode());
    }

    @Test
    public void testConnectWithMultipleContentTypesAndReferrerAndCookies() throws Exception {
        Connection.Request request = new Request();
        request.setUrl("https://example.com").setContentType("application/x-www-form-urlencoded");
        request.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        request.setReferrer("http://example.org").setCookie("test1=cookie1").setCookie("test2=cookie2");
        assertEquals(200, HttpConnection.connect(request).execute().getResponseCode());
    }

    @Test
    public void testConnectWithMultipleHeaders() throws Exception {
        Connection.Request request = new Request();
        request.setUrl("https://example.com").addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        request.addHeader("Accept-Charset", "utf-8");
        assertEquals(200, HttpConnection.connect(request).execute().getResponseCode());
    }

    @Test
    public void testConnectWithMultipleCookiesAndMultipleHeaders() throws Exception {
        Connection.Request request = new Request();
        request.setUrl("https://example.com").setCookie("test1=cookie1").addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        request.addHeader("Accept-Charset", "utf-8");
        assertEquals(200, HttpConnection.connect(request).execute().getResponseCode());
    }

    @Test
    public void testConnectWithMultipleContentTypesAndMultipleCookies() throws Exception {
        Connection.Request request = new Request();
        request.setUrl("https://example.com").setContentType("application/x-www-form-urlencoded").setCookie("test1=cookie1").setCookie("test2=cookie2");
        assertEquals(200, HttpConnection.connect(request).execute().getResponseCode());
    }

    @Test
    public void testConnectWithMultipleContentTypesAndReferrer() throws Exception {
        Connection.Request request = new Request();
        request.setUrl("https://example.com").setContentType("application/x-www-form-urlencoded").addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        assertEquals(200, HttpConnection.connect(request).execute().getResponseCode());
    }

    @Test
    public void testConnectWithMultipleContentTypesAndCookies() throws Exception {
        Connection.Request request = new Request();
        request.setUrl("https://example.com").setContentType("application/x-www-form-urlencoded").addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        request.setCookie("test1=cookie1").setCookie("test2=cookie2");
        assertEquals(200, HttpConnection.connect(request).execute().getResponseCode());
    }

    @Test
    public void testConnectWithMultipleContentTypesAndReferrer() throws Exception {
        Connection.Request request = new Request();
        request.setUrl("https://example.com").setContentType("application/x-www-form-urlencoded").addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        assertEquals(200, HttpConnection.connect(request).execute().getResponseCode());
    }

    @Test
    public void testConnectWithMultipleContentTypesAndCookies() throws Exception {
        Connection.Request request = new Request();
        request.setUrl("https://example.com").setContentType("application/x-www-form-urlencoded").addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        request.setCookie("test1=cookie1").setCookie("test2=cookie2");
        assertEquals(200, HttpConnection.connect(request).execute().getResponseCode());
    }

}