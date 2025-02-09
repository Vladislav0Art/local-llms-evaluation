package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void connectStringTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void connectInvalidStringTest() {
        HttpConnection.connect("invalid-url");
    }

    @Test
    public void connectUrlTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(connection);
    }

    @Test
    public void newRequestTest() {
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.newRequest());
    }

    @Test
    public void urlTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        assertEquals(new URL("http://example.com"), connection.url("http://example.com").request().url());
    }

    @Test
    public void proxyTest() throws Exception {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, null);
        HttpConnection connection = new HttpConnection();
        assertEquals(proxy, connection.proxy(proxy).request().proxy());
    }

    @Test
    public void userAgentTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals("Mozilla", connection.userAgent("Mozilla").request().userAgent());
    }

    @Test
    public void timeoutTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(1000, connection.timeout(1000).request().timeout());
    }

    @Test
    public void maxBodySizeTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(2048, connection.maxBodySize(2048).request().maxBodySize());
    }

    @Test
    public void followRedirectsTest() {
        HttpConnection connection = new HttpConnection();
        assertTrue(connection.followRedirects(true).request().followRedirects());
    }

    @Test
    public void referrerTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals("http://example.com", connection.referrer("http://example.com").request().referrer());
    }

    @Test
    public void methodTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(Connection.Method.GET, connection.method(Connection.Method.GET).request().method());
    }

    @Test
    public void ignoreHttpErrorsTest() {
        HttpConnection connection = new HttpConnection();
        assertTrue(connection.ignoreHttpErrors(true).request().ignoreHttpErrors());
    }

    @Test
    public void ignoreContentTypeTest() {
        HttpConnection connection = new HttpConnection();
        assertTrue(connection.ignoreContentType(true).request().ignoreContentType());
    }

    @Test
    public void dataTest() {
        HttpConnection connection = new HttpConnection();
        assertTrue(connection.data("key", "value").request().data().contains("key"));
    }

    @Test
    public void sslSocketFactoryTest() {
        HttpConnection connection = new HttpConnection();
        assertNull(connection.request().sslSocketFactory());
        SSLSocketFactory socketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        assertEquals(socketFactory, connection.sslSocketFactory(socketFactory).request().sslSocketFactory());
    }

    @Test
    public void dataInputStreamTest() {
        HttpConnection connection = new HttpConnection();
        ByteArrayInputStream inputStream = new ByteArrayInputStream("test-input-stream".getBytes());
        assertEquals(inputStream, connection.data("key", "filename", inputStream).request()
                .data().get("key").inputStream());
    }

    @Test
    public void dataCollectionTest() {
        HttpConnection connection = new HttpConnection();
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        Collection<Connection.KeyVal> kvs = new ArrayList<>();
        kvs.add(kv);
        assertEquals(kvs, connection.data(kvs).request().data());
    }

    @Test
    public void requestBodyTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals("body", connection.requestBody("body").request().requestBody());
    }

    @Test
    public void postDataCharsetTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals("UTF-8", connection.postDataCharset("UTF-8").request().postDataCharset());
    }

    @Test
    public void executeTest() throws IOException {
        HttpConnection connection = HttpConnection.connect("http://example.com");
        assertFalse(connection.execute().hasHeader("non-existing-header"));
    }

    @Test
    public void getTest() throws IOException {
        HttpConnection connection = HttpConnection.connect("http://example.com");
        Document doc = connection.get();
        assertNotNull(doc);
    }

    @Test
    public void postTest() throws IOException {
        HttpConnection connection = HttpConnection.connect("http://example.com");
        Document doc = connection.post();
        assertNotNull(doc);
    }

    @Test
    public void headerTest() {
        HttpConnection connection = new HttpConnection();
        assertFalse(connection.request().hasHeader("Content-Type"));
        connection.header("Content-Type", "application/json");
        assertTrue(connection.request().hasHeader("Content-Type"));
    }

    @Test
    public void headersTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> headers = new HashMap<>();
        headers.put("Accept-Language", "en-US");
        headers.put("Content-Type", "application/json");
        assertFalse(connection.request().hasHeader("Accept-Language"));
        assertFalse(connection.request().hasHeader("Content-Type"));
        connection.headers(headers);
        assertTrue(connection.request().hasHeader("Accept-Language"));
        assertTrue(connection.request().hasHeader("Content-Type"));
    }

    @Test
    public void cookieTest() {
        HttpConnection connection = new HttpConnection();
        assertFalse(connection.request().hasCookie("cookieName"));
        connection.cookie("cookieName", "cookieValue");
        assertTrue(connection.request().hasCookie("cookieName"));
    }

    @Test
    public void cookiesTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> cookies = new HashMap<>();
        cookies.put("cookie1", "value1");
        cookies.put("cookie2", "value2");

        assertFalse(connection.request().hasCookie("cookie1"));
        assertFalse(connection.request().hasCookie("cookie2"));

        connection.cookies(cookies);

        assertTrue(connection.request().hasCookie("cookie1"));
        assertTrue(connection.request().hasCookie("cookie2"));
    }

    @Test
    public void cookieStoreTest() {
        HttpConnection connection = new HttpConnection();
        CookieStore cookieStore = new CookieManager().getCookieStore();
        assertNotEquals(cookieStore, connection.cookieStore());
        connection.cookieStore(cookieStore);
        assertEquals(cookieStore, connection.cookieStore());
    }

}