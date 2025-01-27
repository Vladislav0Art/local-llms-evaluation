package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void buildUrlFromEmptyConnection() {
        // arrange
        Connection connection = null;

        // act
        URL url = new UrlBuilder(connection).build();

        // assert
        assertNull(url);
    }

    @Test
    public void buildUrlWithDefaultScheme() {
        // arrange
        Connection connection = mock(Connection.class);
        when(connection.getScheme()).thenReturn("http");

        // act
        URL url = new UrlBuilder(connection).build();

        // assert
        assertEquals("http://", url.toString());
    }

    @Test
    public void buildUrlWithSpecifiedScheme() {
        // arrange
        Connection connection = mock(Connection.class);
        when(connection.getScheme()).thenReturn("https");

        // act
        URL url = new UrlBuilder(connection).build();

        // assert
        assertEquals("https://", url.toString());
    }

    @Test
    public void appendKeyValWithNoQuery() {
        // arrange
        Connection connection = mock(Connection.class);
        when(connection.getQuery()).thenReturn(null);

        // act
        new UrlBuilder(connection).appendKeyVal(Connection.KeyVal.from("key", "value"));

        // assert
        assertEquals("", connection.getQuery());
    }

    @Test
    public void appendKeyValWithExistingQuery() {
        // arrange
        Connection connection = mock(Connection.class);
        String query = "a=1&b=2";
        when(connection.getQuery()).thenReturn(query);

        // act
        new UrlBuilder(connection).appendKeyVal(Connection.KeyVal.from("c", "d"));

        // assert
        assertEquals("a=1&b=2&c=d", connection.getQuery());
    }

    @Test
    public void appendKeyValWithEncodedValue() throws UnsupportedEncodingException {
        // arrange
        Connection connection = mock(Connection.class);
        when(connection.getQuery()).thenReturn(null);

        // act
        new UrlBuilder(connection).appendKeyVal(Connection.KeyVal.from("key", URLDecoder.decode("value")));

        // assert
        assertEquals("key=value", connection.getQuery());
    }

    @Test
    public void appendKeyValWithInvalidEncoding() throws UnsupportedEncodingException {
        // arrange
        Connection connection = mock(Connection.class);
        when(connection.getQuery()).thenReturn(null);

        // act
        new UrlBuilder(connection).appendKeyVal(Connection.KeyVal.from("key", URLDecoder.decode("value", "invalid")));
    }

}