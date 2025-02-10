package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Document;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedDataSetsData {

    @Test
    public void dataSetsData() {
        String key = "key";
        String value = "value";
        Connection connection = HttpConnection.data(key, value);
        assertEquals(connection.data(key), new java.util.HashMap<String, String>() {{
            put("key", "value");
        }});
    }

}