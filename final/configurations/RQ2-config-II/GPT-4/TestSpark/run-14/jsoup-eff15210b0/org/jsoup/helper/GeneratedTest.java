package org.jsoup.helper;

import org.jsoup.Connection.*;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void connectStringUrlTest() {
        assertNotNull(HttpConnection.connect("http://example.com"));
    }

    @Test
    public void connectUrlTest() throws Exception {
        assertNotNull(HttpConnection.connect(new URL("http://example.com")));
    }

    @Test
    public void getMethodTest() throws IOException {
        assertNotNull(Jsoup.connect("http://example.com").get());
    }

    @Test
    public void postMethodTest() throws IOException {
        assertNotNull(Jsoup.connect("http://example.com").post());
    }

    @Test
    public void executeMethodTest() throws IOException {
        HttpConnection.Response response = (HttpConnection.Response) Jsoup.connect("http://example.com").execute();
        assertNotNull(response);
    }

    @Test
    public void methodWithInvalidMethodTest() throws IOException {
        Jsoup.connect("http://example.com").method(Method.PUT).execute();
    }

    @Test
    public void executeWithUnexpectedMimeTypeTest() throws IOException {
        Jsoup.connect("http://example.com").header("Content-Type", "application/gzip").execute();
    }

    @Test
    public void userAgentMethodTest() {
        assertNotNull(Jsoup.connect("http://example.com").userAgent("Mozilla"));
    }

    @Test
    public void timeoutMethodTest() {
        assertNotNull(Jsoup.connect("http://example.com").timeout(1000));
    }

    @Test
    public void maxBodySizeMethodTest() {
        assertNotNull(Jsoup.connect("http://example.com").maxBodySize(1024));
    }

    @Test
    public void followRedirectsMethodTest() {
        assertNotNull(Jsoup.connect("http://example.com").followRedirects(true));
    }

    @Test
    public void requestBodyMethodTest() {
        assertNotNull(Jsoup.connect("http://example.com").requestBody("requestBody"));
    }

    @Test
    public void headersMethodTest() {
        Map<String, String> headers = new HashMap<>();
        headers.put("headerKey", "headerValue");
        assertNotNull(Jsoup.connect("http://example.com").headers(headers));
    }

}