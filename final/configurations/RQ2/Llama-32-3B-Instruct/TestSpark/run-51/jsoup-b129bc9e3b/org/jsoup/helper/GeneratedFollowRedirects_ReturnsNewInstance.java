package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedFollowRedirects_ReturnsNewInstance {

    @Test
    public void followRedirects_ReturnsNewInstance() throws Exception {
        Connection connection = new HttpConnection();
        connection.followRedirects(true);
        assertNotNull(connection.followRedirects());
    }

}