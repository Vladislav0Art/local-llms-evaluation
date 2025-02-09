package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void connectStringTest() {
        String url = "http://testurl.com";
        Connection connection = HttpConnection.connect(url);
        assertNotNull("Connection should not be null", connection);
    }

    @Test
    public void connectStringWithNullTest() {
        HttpConnection.connect((String) null);
    }

    @Test
    public void connectURLTest() {
        URL url = new URL("http://testurl.com");
        Connection connection = HttpConnection.connect(url);
        assertNotNull("Connection should not be null", connection);
    }

    @Test
    public void connectURLWithNullTest() {
        HttpConnection.connect((URL) null);
    }

    @Test
    public void newRequestTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.newRequest();
        assertNotNull("New connection should not be null", newConnection);
    }

    @Test
    public void urlTest() {
        HttpConnection connection = new HttpConnection();
        Connection updatedConnection = connection.url("http://newtesturl.com");
        assertNotNull("Updated Connection should not be null", updatedConnection);
    }

    @Test
    public void userAgentTest() {
        HttpConnection connection = new HttpConnection();
        Connection updatedConnection = connection.userAgent("Custom User Agent");
        assertNotNull("Updated Connection should not be null", updatedConnection);
    }

    @Test
    public void timeoutTest() {
        HttpConnection connection = new HttpConnection();
        Connection updatedConnection = connection.timeout(5000);
        assertNotNull("Updated connection should not be null", updatedConnection);
    }

    @Test
    public void maxBodySizeTest() {
        HttpConnection connection = new HttpConnection();
        Connection updatedConnection = connection.maxBodySize(5000);
        assertNotNull("Updated connection should not be null", updatedConnection);
    }

    @Test
    public void followRedirectsTest() {
        HttpConnection connection = new HttpConnection();
        Connection updatedConnection = connection.followRedirects(true);
        assertNotNull("Updated connection should not be null", updatedConnection);
    }

    @Test
    public void referrerTest() {
        HttpConnection connection = new HttpConnection();
        Connection updatedConnection = connection.referrer("http://refurl.com");
        assertNotNull("Updated connection should not be null", updatedConnection);
    }

}