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

public class GeneratedConnect_url_withNullUrl_ThrowsExceptionTest {

    @Test
    public void connect_url_withNullUrl_ThrowsExceptionTest() {
        try {
            String url = null;
            HttpConnection.connect(url);
            fail();
        } catch (UncheckedIOException e) {
            assertEquals("url", e.getMessage());
        }
    }

}