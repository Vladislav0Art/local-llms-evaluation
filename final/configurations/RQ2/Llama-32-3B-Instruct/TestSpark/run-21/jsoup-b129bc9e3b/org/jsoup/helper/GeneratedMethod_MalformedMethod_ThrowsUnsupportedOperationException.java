package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedMethod_MalformedMethod_ThrowsUnsupportedOperationException {

    @Test
    public void method_MalformedMethod_ThrowsUnsupportedOperationException() {
        assertThrows(UnsupportedOperationException.class, () -> Connection.method(Connection.Method.METHOD1));
    }

}