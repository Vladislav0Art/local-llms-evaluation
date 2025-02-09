package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void connectStringTest() {
        Connection conn = HttpConnection.connect("http://example.com");
        assertNotNull(conn);
    }

    @Test
    public void connectNullStringTest() {
        HttpConnection.connect((String) null);
    }

    @Test
    public void connectURLTest() throws Exception {
        Connection conn = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(conn);
    }

    @Test
    public void connectNullURLTest() {
        HttpConnection.connect((URL) null);
    }

    @Test
    public void userAgentTest() {
        HttpConnection conn = new HttpConnection();
        conn.userAgent("Mozilla");
        assertEquals("Mozilla", conn.request().userAgent());
    }

    @Test
    public void userAgentNullTest() {
        HttpConnection conn = new HttpConnection();
        conn.userAgent(null);
    }

    @Test
    public void urlTest() throws Exception {
        HttpConnection conn = new HttpConnection();
        conn.url(new URL("http://example.com"));
        assertEquals("http://example.com", conn.request().url().toString());
    }

    @Test
    public void urlNullTest() {
        HttpConnection conn = new HttpConnection();
        conn.url((URL) null);
    }

    @Test
    public void executeGetTest() throws Exception {
        HttpConnection conn = HttpConnection.connect("http://example.com");
        conn.method(Connection.Method.GET);
        Connection.Response response = conn.execute();
        assertTrue(response.statusCode() >= 200 && response.statusCode() < 400);
    }

    @Test
    public void executePostTest() throws Exception {
        HttpConnection conn = HttpConnection.connect("http://example.com");
        conn.method(Connection.Method.POST);
        conn.execute();
    }

    @Test
    public void cookieTest() {
        HttpConnection conn = new HttpConnection();
        conn.cookie("name", "value");
        assertEquals("value", conn.request().cookie("name"));
    }

    @Test
    public void cookieNullNameTest() {
        HttpConnection conn = new HttpConnection();
        conn.cookie(null, "value");
    }

    @Test
    public void cookieNullValueTest() {
        HttpConnection conn = new HttpConnection();
        conn.cookie("name", null);
    }

    @Test
    public void dataTest() {
        HttpConnection conn = new HttpConnection();
        conn.data("name", "value");
        assertEquals("value", conn.request().data().get(0).value());
    }

    @Test
    public void dataNullNameTest() {
        HttpConnection conn = new HttpConnection();
        conn.data(null, "value");
    }

    @Test
    public void dataNullValueTest() {
        HttpConnection conn = new HttpConnection();
        conn.data("name", null);
    }

}