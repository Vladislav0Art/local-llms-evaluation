package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedUrlString_Test {

    @Test
    public void urlString_Test() {
        // arrange
        String url = "http://example.com";
        // act
        Connection connection = HttpConnection.url(url);
        // assert
        assertNotNull(connection);
    }

}