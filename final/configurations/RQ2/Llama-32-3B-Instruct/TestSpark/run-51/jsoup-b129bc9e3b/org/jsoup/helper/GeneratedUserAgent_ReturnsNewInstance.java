package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedUserAgent_ReturnsNewInstance {

    @Test
    public void userAgent_ReturnsNewInstance() throws Exception {
        Connection connection = new HttpConnection();
        connection.userAgent("Mozilla/5.0");
        assertNotNull(connection.userAgent());
    }

}