package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedTimeout_ReturnsNewInstance {

    @Test
    public void timeout_ReturnsNewInstance() throws Exception {
        Connection connection = new HttpConnection();
        connection.timeout(1000);
        assertNotNull(connection.timeout());
    }

}