package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;

public class GeneratedConnectStringThrows MalformedURLExceptionException {

    @Test
    public void connectStringThrows

    MalformedURLExceptionException() {
        String url = "example.com";
        try {
            HttpConnection.connect(url);
            assert false;
        } catch (UncheckedIOException e) {
            assertTrue(e.getCause() instanceof MalformedURLException);
        }
    }

}