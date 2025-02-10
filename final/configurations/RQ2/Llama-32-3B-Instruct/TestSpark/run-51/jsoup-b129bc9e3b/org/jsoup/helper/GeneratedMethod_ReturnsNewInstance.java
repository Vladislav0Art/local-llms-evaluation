package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedMethod_ReturnsNewInstance {

    @Test
    public void method_ReturnsNewInstance() throws Exception {
        Connection connection = new HttpConnection();
        connection.method(Connection.Method.GET);
        assertNotNull(connection.method());
    }

}