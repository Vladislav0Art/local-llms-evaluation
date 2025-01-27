package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedConnectString {

    @Test
    public void connectString() {
        Connection conn = HttpConnection.connect("http://example.com");
        assertNull(conn.request());
    }

}