package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedPost_body_containsValuesTest {

    @Test
    public void post_body_containsValuesTest() throws IOException {
        Connection connection = new HttpConnection();
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        connection.data(data);
        String body = connection.requestBody().body();
        assertTrue(body.contains("key=value"));
    }

}