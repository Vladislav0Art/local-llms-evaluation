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

public class GeneratedGet_body_isEmptyStringTest {

    @Test
    public void get_body_isEmptyStringTest() throws IOException {
        Connection connection = new HttpConnection();
        connection.method(Connection.Method.GET);
        String body = connection.requestBody().body();
        assertEquals("", body, StringComparison.UTF_8);
    }

}