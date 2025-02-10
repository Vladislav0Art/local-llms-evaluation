package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.nio.charset.Charset;

public class GeneratedTimeout_int_to_int_test {

    @Test
    public void timeout_int_to_int_test() {
        int timeout = 1000;
        Connection conn = HttpConnection.timeout(timeout);
        assertNotNull(conn);
    }

}