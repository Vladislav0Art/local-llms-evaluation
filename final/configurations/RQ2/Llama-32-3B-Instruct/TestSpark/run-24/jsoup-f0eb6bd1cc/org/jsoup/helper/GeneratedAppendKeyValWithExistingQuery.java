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

public class GeneratedAppendKeyValWithExistingQuery {

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

}