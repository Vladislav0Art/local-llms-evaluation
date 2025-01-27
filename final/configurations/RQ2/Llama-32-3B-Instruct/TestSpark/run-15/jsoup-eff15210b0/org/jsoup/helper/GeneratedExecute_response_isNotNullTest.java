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

public class GeneratedExecute_response_isNotNullTest {

    @Test
    public void execute_response_isNotNullTest() throws IOException {
        Connection connection = new HttpConnection();
        connection.method(Connection.Method.GET);
        Connection.Response response = connection.execute();
        assertNotNull(response);
    }

}