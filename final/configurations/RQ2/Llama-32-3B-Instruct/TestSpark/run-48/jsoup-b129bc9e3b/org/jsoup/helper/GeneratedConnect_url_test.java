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

public class GeneratedConnect_url_test {

    @Test
    public void connect_url_test() {
        Connection conn = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(conn);
    }

}