package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedData_MalformedData_ThrowsUnsupportedOperationException {

    @Test
    public void data_MalformedData_ThrowsUnsupportedOperationException() {
        assertThrows(UnsupportedOperationException.class, () -> Connection.data("malformed"));
    }

}