package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Response;
import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    private HttpConnection connection;

    @Before
    public void setUp() {
        connection = new HttpConnection();
    }

    @After
    public void tearDown() {
        connection = null;
    }

    @Test
    public void getUrlTest() {
        // Arrange
        URL expected = new URL("http://example.com");
        connection.url(expected);

        // Act
        URL actual = connection.getUrl();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getProxyTest() {
        // Arrange
        Proxy expected = Proxy.NO_PROXY;
        connection.proxy(expected);

        // Act
        Proxy actual = connection.getProxy();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getUserAgentTest() {
        // Arrange
        String expected = "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:40.0) Gecko/20100101 Firefox/40.1";
        connection.userAgent(expected);

        // Act
        String actual = connection.getUserAgent();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void getTimeoutTest() {
        // Arrange
        int expected = 3000;
        connection.timeout(expected);

        // Act
        int actual = connection.getTimeout();

        // Assert
        assertEquals(expected, actual);
    }

}