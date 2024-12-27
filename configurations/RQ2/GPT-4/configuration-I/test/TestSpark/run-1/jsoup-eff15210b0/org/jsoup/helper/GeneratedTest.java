package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.io.InputStream;
import java.net.Proxy;
import java.util.*;

public class GeneratedTest {

    @Test
    public void connectUrlTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void connectStringTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void timeoutTest() {
        Connection connection = new HttpConnection();
        connection.timeout(5000);
        assertEquals(5000, connection.request().timeout());
    }

    @Test
    public void maxBodySizeTest() {
        Connection connection = new HttpConnection();
        connection.maxBodySize(1024);
        assertEquals(1024, connection.request().maxBodySize());
    }

    @Test
    public void followRedirectsTest() {
        Connection connection = new HttpConnection();
        connection.followRedirects(false);
        assertEquals(false, connection.request().followRedirects());
    }

    @Test
    public void methodTest() {
        Connection connection = new HttpConnection();
        Connection.Method method = Connection.Method.GET;
        connection.method(method);
        assertEquals(method, connection.request().method());
    }

    @Test
    public void ignoreHttpErrorsTest() {
        Connection connection = new HttpConnection();
        connection.ignoreHttpErrors(true);
        assertEquals(true, connection.request().ignoreHttpErrors());
    }

    @Test
    public void getTest() {
        Connection connection = new HttpConnection().url("http://example.com");
        try {
            connection.get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void postTest() {
        Connection connection = new HttpConnection().url("http://example.com");
        try {
            connection.post();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void executeTest() {
        Connection connection = new HttpConnection().url("http://example.com");
        try {
            connection.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}