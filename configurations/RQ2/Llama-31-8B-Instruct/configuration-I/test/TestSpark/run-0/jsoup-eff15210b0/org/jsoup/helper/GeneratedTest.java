package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.Request;
import org.jsoup.Connection.Response;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;

public class GeneratedTest {

    @Test
    public void connectUrlStringTest() {
        HttpConnection connection = HttpConnection.connect("https://www.example.com");
        assertNotNull(connection);
    }

    @Test
    public void connectUrlUrlTest() {
        URL url = new URL("https://www.example.com");
        HttpConnection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

    @Test
    public void newRequestTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.newRequest();
        assertNotNull(newConnection);
    }

    @Test
    public void urlUrlTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.url(new URL("https://www.example.com"));
        assertNotNull(newConnection);
    }

    @Test
    public void urlStringTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.url("https://www.example.com");
        assertNotNull(newConnection);
    }

    @Test
    public void proxyProxyTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.proxy(new org.jsoup.helper.HttpConnection.Proxy("localhost", 8080));
        assertNotNull(newConnection);
    }

    @Test
    public void proxyHostPortTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.proxy("localhost", 8080);
        assertNotNull(newConnection);
    }

    @Test
    public void userAgentTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.userAgent("Mozilla/5.0");
        assertNotNull(newConnection);
    }

    @Test
    public void timeoutTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.timeout(1000);
        assertNotNull(newConnection);
    }

}