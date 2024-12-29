package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.HttpCookie;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void connectStringTest() {
        Connection connection = HttpConnection.connect("http://www.google.com");
        Assert.assertNotNull(connection);
    }

    @Test
    public void connectStringInvalidTest() {
        Connection connection = HttpConnection.connect("invalid");
    }

    @Test
    public void newRequestTest() {
        Connection connection = Jsoup.connect("http://www.google.com");
        Connection newConnection = connection.newRequest();
        Assert.assertNotNull(newConnection);
    }

    @Test
    public void urlTest() {
        Connection connection = Jsoup.connect("http://www.google.com").url("http://www.example.com");
        Assert.assertEquals("http://www.example.com", connection.request().url().toString());
    }

    @Test
    public void headersTest() {
        Map<String, String> headers = new HashMap<>();
        headers.put("header1", "value1");
        headers.put("header2", "value2");

        Connection connection = Jsoup.connect("http://www.google.com").headers(headers);
        Assert.assertFalse(connection.request().headers().isEmpty());
    }

    @Test
    public void cookieStoreTest() {
        Connection connection = Jsoup.connect("http://www.google.com");
        connection.cookie("cookie-name", "cookie-value");
        Assert.assertEquals("cookie-value", connection.request().cookie("cookie-name"));
    }

    @Test
    public void getTest() throws IOException {
        Document doc = Jsoup.connect("http://www.google.com").get();
        Assert.assertNotNull(doc.title());
    }

    @Test
    public void postTest() throws IOException {
        Connection.Response response = Jsoup.connect("http://www.httpbin.org/post")
                .data("key", "value")
                .method(Connection.Method.POST)
                .execute();
        Assert.assertNotNull(response);
    }

    @Test
    public void requestDataTest() {
        Connection connection = Jsoup.connect("http://www.google.com").data("key", "value");
        Assert.assertFalse(connection.request().data().isEmpty());
    }

}