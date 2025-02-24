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

public class GeneratedGetUrlTest {

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

}