package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedGet_MalformedResponse_ThrowsIOException {

    @Test
    public void get_MalformedResponse_ThrowsIOException() {
        assertThrows(IOException.class, () -> new HttpConnection().get());
    }

}