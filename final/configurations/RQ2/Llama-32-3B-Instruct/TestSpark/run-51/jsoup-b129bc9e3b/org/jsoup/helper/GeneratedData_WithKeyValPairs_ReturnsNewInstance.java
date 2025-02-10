package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedData_WithKeyValPairs_ReturnsNewInstance {

    @Test
    public void data_WithKeyValPairs_ReturnsNewInstance() throws Exception {
        Connection connection = new HttpConnection();
        connection.data("key", "value");
        assertNotNull(connection.data());
    }

}