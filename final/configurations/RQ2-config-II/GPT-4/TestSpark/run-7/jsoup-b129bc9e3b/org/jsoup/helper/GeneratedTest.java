package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Proxy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void connectURLTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.connect(url);
        Assert.assertEquals(connection.request().url(), url);
    }

    @Test
    public void connectStringTest() {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        Assert.assertEquals(connection.request().url().toString(), url);
    }

    @Test
    public void urlStringTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("http://example.com");
        Assert.assertEquals(httpConnection.request().url().toString(), "http://example.com");
    }

    @Test
    public void urlStringInvalidTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("not-a-url");
    }

    @Test
    public void urlURLTest() throws MalformedURLException {
        HttpConnection httpConnection = new HttpConnection();
        URL url = new URL("http://example.com");
        httpConnection.url(url);
        Assert.assertEquals(httpConnection.request().url(), url);
    }

    @Test
    public void userAgentTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.userAgent("Mozilla");
        Assert.assertEquals(httpConnection.request().userAgent(), "Mozilla");
    }

    @Test
    public void ignoreHttpErrorsTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.ignoreHttpErrors(true);
        Assert.assertTrue(httpConnection.request().ignoreHttpErrors());
    }

    @Test
    public void ignoreContentTypeTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.ignoreContentType(true);
        Assert.assertTrue(httpConnection.request().ignoreContentType());
    }

    @Test
    public void dataTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data("key", "value");
        Assert.assertEquals(httpConnection.request().data().get(0).value(), "value");
        Assert.assertEquals(httpConnection.request().data().get(0).key(), "key");
    }

    @Test
    public void requestBodyTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.requestBody("body");
        Assert.assertEquals(httpConnection.request().requestBody(), "body");
    }

    @Test
    public void headerTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.header("key", "value");
        Assert.assertEquals(httpConnection.request().headers().get("key"), "value");
    }

    @Test
    public void cookieTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.cookie("key", "value");
        Assert.assertEquals(httpConnection.request().cookies().get("key"), "value");
    }

    @Test
    public void executeTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("http://example.com");
        Connection.Response response = httpConnection.execute();
        Assert.assertNotNull(response);
    }

    @Test
    public void parserTest() {
        HttpConnection httpConnection = new HttpConnection();
        Parser parser = Parser.htmlParser();
        httpConnection.parser(parser);
        Assert.assertEquals(httpConnection.request().parser(), parser);
    }

}