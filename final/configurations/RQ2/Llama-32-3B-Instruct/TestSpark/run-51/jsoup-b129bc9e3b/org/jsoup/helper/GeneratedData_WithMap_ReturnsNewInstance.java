package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedData_WithMap_ReturnsNewInstance {

    @Test
    public void data_WithMap_ReturnsNewInstance() throws Exception {
        Connection connection = new HttpConnection();
        Map<String, String> data = Collections.singletonMap("key", "value");
        connection.data(data);
        assertNotNull(connection.data());
    }

}