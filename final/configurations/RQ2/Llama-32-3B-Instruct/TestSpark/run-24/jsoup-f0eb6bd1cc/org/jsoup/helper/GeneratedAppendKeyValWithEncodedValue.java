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

public class GeneratedAppendKeyValWithEncodedValue {

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

}