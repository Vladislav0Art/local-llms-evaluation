package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedMaxBodySize_ReturnsNewInstance {

    @Test
    public void maxBodySize_ReturnsNewInstance() throws Exception {
        Connection connection = new HttpConnection();
        connection.maxBodySize(1024);
        assertNotNull(connection.maxBodySize());
    }

}