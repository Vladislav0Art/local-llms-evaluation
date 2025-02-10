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

public class GeneratedReferrer_string_to_string_test {

    @Test
    public void referrer_string_to_string_test() {
        String referrer = "https://example.com/referrer";
        Connection conn = HttpConnection.referrer(referrer);
        assertNotNull(conn);
    }

}