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
public class GeneratedCookieNameValue_Test {

    @Test
    public void cookieNameValue_Test() {
        // arrange
        String name = "cookie";
        String value = "value";
        // act
        Connection connection = HttpConnection.cookie(name, value);
        // assert
        assertNotNull(connection);
    }

}