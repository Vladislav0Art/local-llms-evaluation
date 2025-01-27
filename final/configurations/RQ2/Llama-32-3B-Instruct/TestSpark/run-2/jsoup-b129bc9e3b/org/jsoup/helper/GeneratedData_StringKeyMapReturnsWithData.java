package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedData_StringKeyMapReturnsWithData {

    @Test
    public void data_StringKeyMapReturnsWithData() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        Connection connection = HttpConnection.data(map);
        assertNotNull(connection);
    }

}