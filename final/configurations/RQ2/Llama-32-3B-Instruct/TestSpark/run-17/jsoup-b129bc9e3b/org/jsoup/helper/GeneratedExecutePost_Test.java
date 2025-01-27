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
public class GeneratedExecutePost_Test {

    @Test
    public void executePost_Test() throws IOException {
        // arrange
        URL url = new URL("http://example.com");
        // act
        Document document = HttpConnection.post().execute();
        // assert
        assertNotNull(document);
    }

}