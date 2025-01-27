package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedConnect_MalformedURLConnect_ThrowsMalformedURLException {

    @Test
    public void connect_MalformedURLConnect_ThrowsMalformedURLException() {
        URL url = new URL(null);
        HttpConnection.connect(url);
    }

}