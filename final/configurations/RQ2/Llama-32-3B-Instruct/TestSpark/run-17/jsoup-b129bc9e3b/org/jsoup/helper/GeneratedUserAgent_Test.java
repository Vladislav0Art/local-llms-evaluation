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
public class GeneratedUserAgent_Test {

    @Test
    public void userAgent_Test() {
        // arrange
        String userAgent = "Mozilla/5.0";
        // act
        Connection connection = HttpConnection.userAgent(userAgent);
        // assert
        assertNotNull(connection);
    }

}