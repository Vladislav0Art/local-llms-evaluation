package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Parser;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.model.Header;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

public class GeneratedTest {

    @Test
    public void connectUrlTest() {
        HttpConnection connection = (HttpConnection) HttpConnection.connect("http://google.com");
        Assert.assertEquals("http://google.com", connection.request().url().toString());
    }

    @Test
    public void connectStringTest() throws Exception {
        HttpConnection connection = (HttpConnection) HttpConnection.connect(new URL("http://google.com"));
        Assert.assertEquals("http://google.com", connection.request().url().toString());
    }

    @Test
    public void urlTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.url("http://google.com");
        Assert.assertEquals("http://google.com", ((HttpConnection) connection).request().url().toString());
    }

    @Test
    public void badUrlTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("badurl");
    }

    @Test
    public void userAgentTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.userAgent("TestAgent");
        Assert.assertEquals("TestAgent", ((HttpConnection) connection).request().userAgent());
    }

    @Test
    public void timeoutTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.timeout(5000);
        Assert.assertEquals(5000, ((HttpConnection) connection).request().timeout());
    }

    @Test
    public void maxBodySizeTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.maxBodySize(1024);
        Assert.assertEquals(1024, ((HttpConnection) connection).request().maxBodySize());
    }

    @Test
    public void followRedirectsTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.followRedirects(true);
        Assert.assertTrue(((HttpConnection) connection).request().followRedirects());
    }

    @Test
    public void ignoreHttpErrorsTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.ignoreHttpErrors(true);
        Assert.assertTrue(((HttpConnection) connection).request().ignoreHttpErrors());
    }

    @Test
    public void ignoreContentTypeTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.ignoreContentType(true);
        Assert.assertTrue(((HttpConnection) connection).request().ignoreContentType());
    }

    @Test
    public void dataKeyValTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.data("key1", "value1");
        Assert.assertEquals("value1", ((HttpConnection) connection).request().data().get(0).value());
    }

    @Test
    public void executeTest() throws Exception {
        ClientAndServer mockServer = ClientAndServer.startClientAndServer();
        mockServer.when(
                request().withMethod("GET").withPath("/"),
                Times.exactly(1)
        ).respond(response().withStatusCode(200).withHeaders(
                new Header("Content-Type", "text/html;charset=utf-8"),
                new Header("Date", "Tue, 06 Apr 2021 11:43:36 GMT"))
        );
        Connection.Response response = HttpConnection.connect(new URL("http://localhost:" + mockServer.getLocalPort()))
                .method(Connection.Method.GET)
                .execute();
        Assert.assertEquals(200, response.statusCode());
        mockServer.stop();
    }

}