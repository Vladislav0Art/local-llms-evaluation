package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void connectStringTest() {
        HttpConnection httpConnection = (HttpConnection) HttpConnection.connect("http://example.com");
        assertNotNull(httpConnection);
    }

    @Test
    public void connectURLTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        HttpConnection httpConnection = (HttpConnection) HttpConnection.connect(url);
        assertNotNull(httpConnection);
    }

    @Test
    public void newRequestTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.newRequest();
        assertNotEquals(httpConnection, connection);
    }

    @Test
    public void urlURLTest() throws MalformedURLException {
        HttpConnection httpConnection = new HttpConnection();
        URL url = new URL("http://example.com");
        httpConnection = (HttpConnection) httpConnection.url(url);
        assertNotNull(httpConnection);
    }

    @Test
    public void urlStringTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection = (HttpConnection) httpConnection.url("http://example.com");
        assertNotNull(httpConnection);
    }

    @Test
    public void getTest() throws IOException {
        HttpConnection httpConnection = (HttpConnection) HttpConnection.connect("http://example.com");
        Document document = httpConnection.get();
        assertNotNull(document);
    }

    @Test
    public void postTest() throws IOException {
        HttpConnection httpConnection = (HttpConnection) HttpConnection.connect("http://example.com");
        Document document = httpConnection.post();
        assertNotNull(document);
    }

    @Test
    public void executeTest() throws IOException {
        HttpConnection httpConnection = (HttpConnection) HttpConnection.connect("http://example.com");
        Connection.Response response = httpConnection.execute();
        assertNotNull(response);
    }

}