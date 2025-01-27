package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedProxy_MalformedProxy_ThrowsIllegalArgumentException {

    @Test
    public void proxy_MalformedProxy_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Connection.proxy(null));
    }

}