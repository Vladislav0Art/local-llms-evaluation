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

public class GeneratedGet_request_isNotNullTest {

    @Test
    public void get_request_isNotNullTest() {
        Connection connection = new HttpConnection();
        connection.method(Connection.Method.GET);
        Connection.Request request = connection.request();
        assertNotNull(request);
    }

}