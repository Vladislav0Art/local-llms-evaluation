package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedData_StringKeyReturnsWithData {

    @Test
    public void data_StringKeyReturnsWithData() {
        String key = "key";
        Connection connection = HttpConnection.data(key);
        assertNotNull(connection);
    }

}