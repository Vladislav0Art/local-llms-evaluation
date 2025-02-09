package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void connectUrlTest() {
        String testUrl = "http://google.com";
        Connection connection = HttpConnection.connect(testUrl);
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void userAgentTest() {
        String testUserAgent = "Mozilla/5.0";
        HttpConnection connection = new HttpConnection();
        connection.userAgent(testUserAgent);
        assertEquals(testUserAgent, connection.request().userAgent());
    }

    @Test
    public void timeoutTest() {
        int testTimeout = 3000;
        HttpConnection connection = new HttpConnection();
        connection.timeout(testTimeout);
        assertEquals(testTimeout, connection.request().timeout());
    }

    @Test
    public void followRedirectsTest() {
        HttpConnection connection = new HttpConnection();
        connection.followRedirects(true);
        assertTrue(connection.request().followRedirects());
    }

    @Test
    public void methodTest() {
        Connection.Method testMethod = Connection.Method.GET;
        HttpConnection connection = new HttpConnection();
        connection.method(testMethod);
        assertEquals(testMethod, connection.request().method());
    }

    @Test
    public void ignoreHttpErrorsTest() {
        HttpConnection connection = new HttpConnection();
        connection.ignoreHttpErrors(true);
        assertTrue(connection.request().ignoreHttpErrors());
    }

    @Test
    public void dataKeyValTest() {
        String testKey = "key";
        String testVal = "value";
        HttpConnection connection = new HttpConnection();
        connection.data(testKey, testVal);
        assertEquals(testVal, connection.request().data().get(0).value());
    }

    @Test
    public void dataMapTest() {
        Map<String, String> testData = new HashMap<>();
        testData.put("key1", "value1");
        testData.put("key2", "value2");
        HttpConnection connection = new HttpConnection();
        connection.data(testData);
        assertEquals(testData.size(), connection.request().data().size());
    }

    @Test
    public void requestBodyTest() {
        String testBody = "testRequestBody";
        HttpConnection connection = new HttpConnection();
        connection.requestBody(testBody);
        assertEquals(testBody, connection.request().requestBody());
    }

    @Test
    public void executeTest() throws IOException {
        String testUrl = "http://google.com";
        HttpConnection connection = new HttpConnection();
        connection.url(testUrl);
        connection.execute();
        assertEquals(200, connection.response().statusCode());
    }

    @Test
    public void parserTest() {
        Parser testParser = Parser.htmlParser();
        HttpConnection connection = new HttpConnection();
        connection.parser(testParser);
        assertEquals(testParser, connection.request().parser());
    }

    @Test
    public void postTest() throws IOException {
        String testUrl = "http://google.com";
        HttpConnection connection = new HttpConnection();
        connection.url(testUrl);
        Document doc = connection.post();
        assertEquals("Google", doc.title());
    }

    @Test
    public void proxyTest() {
        Proxy testProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
        HttpConnection connection = new HttpConnection();
        connection.proxy(testProxy);
        assertEquals(testProxy, connection.request().proxy());
    }

    @Test
    public void maxBodySizeTest() {
        int maxSize = 1024;
        HttpConnection connection = new HttpConnection();
        connection.maxBodySize(maxSize);
        assertEquals(maxSize, connection.request().maxBodySize());
    }

    @Test
    public void postDataCharsetTest() {
        String charset = "UTF-16";
        HttpConnection connection = new HttpConnection();
        connection.postDataCharset(charset);
        assertEquals(charset, connection.request().postDataCharset());
    }

}