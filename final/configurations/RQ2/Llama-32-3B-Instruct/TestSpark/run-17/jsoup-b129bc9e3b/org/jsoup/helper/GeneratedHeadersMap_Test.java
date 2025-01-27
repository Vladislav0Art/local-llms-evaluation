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
public class GeneratedHeadersMap_Test {

    @Test
    public void headersMap_Test() {
        // arrange
        Map<String, String> headers = new LinkedHashMap<>();
        headers.put("Content-Type", "application/json");
        // act
        Connection connection = HttpConnection.headers(headers);
        // assert
        assertNotNull(connection);
    }

}