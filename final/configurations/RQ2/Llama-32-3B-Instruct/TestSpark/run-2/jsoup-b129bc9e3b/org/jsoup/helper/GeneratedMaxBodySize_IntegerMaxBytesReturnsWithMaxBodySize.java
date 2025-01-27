package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedMaxBodySize_IntegerMaxBytesReturnsWithMaxBodySize {

    @Test
    public void maxBodySize_IntegerMaxBytesReturnsWithMaxBodySize() {
        int bytes = 1024;
        Connection connection = HttpConnection.maxBodySize(bytes);
        assertNotNull(connection);
    }

}