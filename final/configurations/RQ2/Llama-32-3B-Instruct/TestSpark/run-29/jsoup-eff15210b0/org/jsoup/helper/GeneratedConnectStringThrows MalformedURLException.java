package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;

public class GeneratedConnectStringThrows MalformedURLException {

    @Test
    public void connectStringThrows

    MalformedURLException() {
        String url = "example.com";
        try {
            HttpConnection.connect(url);
            assert false;
        } catch (MalformedURLException e) {
            // expected
        }
    }

}