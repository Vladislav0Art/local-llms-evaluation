package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedUrl_MalformedURL_ThrowsMalformedURLException {

    @Test
    public void url_MalformedURL_ThrowsMalformedURLException() {
        assertThrows(MalformedURLException.class, () -> Connection.url("malformed://example.com"));
    }

}