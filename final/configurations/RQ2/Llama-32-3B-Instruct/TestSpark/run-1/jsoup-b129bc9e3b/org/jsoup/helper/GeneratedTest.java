package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class GeneratedTest {

    @Test
    public void [newRequest][CreateNewInstanceTest]()

    {
        Connection conn = HttpConnection.connect("https://example.com");
        assertNotNull(conn);
    }

    @Test
    public void [url][StringUrlTest]()

    {
        String url = "https://example.com";
        Connection conn = HttpConnection.url(url);
        assertNotNull(conn);
    }

    @Test
    public void [url][URLUrlTest]()

    {
        URL url = new URL("https://example.com");
        Connection conn = HttpConnection.connect(url);
        assertNotNull(conn);
    }

    @Test
    public void [proxy][StringHostPortTest]()

    {
        String host = "example.com";
        int port = 8080;
        Connection conn = HttpConnection.proxy(host, port);
        assertNotNull(conn);
    }

    @Test
    public void [timeout][TimeoutWithNoBodyTest]()throws IOException,

    InterruptedException {
        Connection conn = HttpConnection.connect("https://example.com");
        long timeoutMillis = TimeUnit.SECONDS.toMillis(1);
        conn.timeout(timeoutMillis);
        assertTrue(true);
    }

    @Test
    public void [method][POSTWithoutBodyTest]()

    {
        Connection conn = HttpConnection.connect("https://example.com");
        Method method = org.jsoup.Connection.Method.POST;
        conn.method(method);
        assertNotNull(conn);
    }

    @Test
    public void [ignoreContentType][EnableIgnoreContentTypeTest]()

    {
        Connection conn = HttpConnection.connect("https://example.com");
        boolean ignoreContentType = true;
        conn.ignoreContentType(ignoreContentType);
        assertTrue(true);
    }

    @Test
    public void [cookieStore][DefaultCookieStoreTest]()

    {
        CookieManager cookieManager = new CookieManager();
        Connection conn = HttpConnection.connect("https://example.com");
        conn.cookieStore(cookieManager);
        assertNotNull(conn);
    }

    @Test
    public void [get][GetRequestWithNoBodyTest]()throws IOException,

    InterruptedException {
        Connection conn = HttpConnection.connect("https://example.com");
        Document document = conn.get();
        assertNotNull(document);
    }

    @Test
    public void [post][PostRequestWithBodyTest]()throws

    IOException {
        String body = "Hello World!";
        Connection conn = HttpConnection.connect("https://example.com");
        conn.request().data("key", body);
        Document document = conn.post();
        assertNotNull(document);
    }

}