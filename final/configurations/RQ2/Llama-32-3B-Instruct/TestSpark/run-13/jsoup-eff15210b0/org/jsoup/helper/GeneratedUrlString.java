package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedUrlString {

    @Test
    public void urlString() {
        String url = "http://example.com";
        Connection conn = HttpConnection.url(url);
        assertNull(conn.request());
    }

}