package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedConnectUrl {

    @Test
    public void connectUrl() {
        Connection conn = HttpConnection.connect(new URL("http://example.com"));
        assertNull(conn.request());
    }

}