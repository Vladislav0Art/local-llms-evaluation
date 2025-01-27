package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedCookie_MalformedCookie_ThrowsUnsupportedOperationException {

    @Test
    public void cookie_MalformedCookie_ThrowsUnsupportedOperationException() {
        assertThrows(UnsupportedOperationException.class, () -> Connection.cookie(null));
    }

}