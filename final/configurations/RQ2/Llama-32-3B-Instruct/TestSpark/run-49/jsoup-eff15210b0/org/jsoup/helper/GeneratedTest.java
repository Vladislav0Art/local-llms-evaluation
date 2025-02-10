package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void newRequest() {
        Connection connection = HttpConnection.connect("https://www.example.com");
        assertEquals(Connection.class, connection.getClass());
    }

    @Test
    public void url() {
        Connection connection = HttpConnection.url("https://www.example.com");
        assertEquals(Connection.class, connection.getClass());
        assertEquals(String.class, connection.url().getClass());
    }

    @Test
    public void proxy() {
        Proxy proxy = new org.junit.rules.Proxy();
        Connection connection = HttpConnection.proxy(proxy);
        assertEquals(Connection.class, connection.getClass());
        assertEquals(Proxy.class, connection.proxy().getClass());
    }

    @Test
    public void userAgent() {
        String userAgent = "Mozilla/5.0";
        Connection connection = HttpConnection.userAgent(userAgent);
        assertEquals(String.class, connection.userAgent().getClass());
        assertEquals(userAgent, connection.userAgent().get());
    }

    @Test
    public void timeout() {
        int millis = 10000;
        Connection connection = HttpConnection.timeout(millis);
        assertEquals(int.class, connection.timeout().getClass());
        assertEquals(millis, connection.timeout());
    }

    @Test
    public void maxBodySize() {
        int bytes = 1024;
        Connection connection = HttpConnection.maxBodySize(bytes);
        assertEquals(int.class, connection.maxBodySize().getClass());
        assertEquals(bytes, connection.maxBodySize());
    }

    @Test
    public void followRedirects() {
        boolean followRedirects = true;
        Connection connection = HttpConnection.followRedirects(followRedirects);
        assertEquals(boolean.class, connection.followRedirects().getClass());
        assertEquals(followRedirects, connection.followRedirects());
    }

    @Test
    public void referrer() {
        String referrer = "https://www.example.com";
        Connection connection = HttpConnection.referrer(referrer);
        assertEquals(String.class, connection.referrer().getClass());
        assertEquals(referrer, connection.referrer());
    }

    @Test
    public void method() {
        org.jsoup.Connection.Method method = org.jsoup.Connection.Method.GET;
        Connection connection = HttpConnection.method(method);
        assertEquals(org.jsoup.Connection.Method.class, connection.method().getClass());
        assertEquals(method, connection.method());
    }

    @Test
    public void ignoreHttpErrors() {
        boolean ignoreHttpErrors = true;
        Connection connection = HttpConnection.ignoreHttpErrors(ignoreHttpErrors);
        assertEquals(boolean.class, connection.ignoreHttpErrors().getClass());
        assertEquals(ignoreHttpErrors, connection.ignoreHttpErrors());
    }

    @Test
    public void ignoreContentType() {
        boolean ignoreContentType = false;
        Connection connection = HttpConnection.ignoreContentType(ignoreContentType);
        assertEquals(boolean.class, connection.ignoreContentType().getClass());
        assertEquals(ignoreContentType, connection.ignoreContentType());
    }

    @Test
    public void data() {
        String key = "key";
        String value = "value";
        Connection connection = HttpConnection.data(key, value);
        assertEquals(String.class, connection.data().getClass());
        assertEquals(Map.Entry.class, connection.data().entrySet().iterator().next().getClass());
        assertEquals(value, connection.data().get("key"));
    }

    @Test
    public void sslSocketFactory() {
        SSLSocketFactory sslSocketFactory = new org.junit.rules.SSLSocketFactory();
        Connection connection = HttpConnection.sslSocketFactory(sslSocketFactory);
        assertEquals(SSLSocketFactory.class, connection.sslSocketFactory().getClass());
        assertEquals(sslSocketFactory, connection.sslSocketFactory());
    }

    @Test
    public void get() throws IOException {
        Document document = new org.jsoup.nodes.Document();
        Connection connection = HttpConnection.connect("https://www.example.com");
        assertEquals(Document.class, connection.get().getClass());
        assertEquals(document, connection.get());
    }

    @Test
    public void post() throws IOException {
        Document document = new org.jsoup.nodes.Document();
        Connection connection = HttpConnection.post("https://www.example.com", document);
        assertEquals(Document.class, connection.post().getClass());
        assertEquals(document, connection.post());
    }

    @Test
    public void execute() throws IOException {
        Connection connection = HttpConnection.connect("https://www.example.com");
        Connection.Response response = new org.jsoup.Connection.Response();
        assertEquals(Connection.Response.class, connection.execute(response).getClass());
        assertEquals(response, connection.execute(response));
    }

}