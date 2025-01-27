package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedTimeout {

    @Test
    public void timeout() {
        int millis = 1000;
        Connection conn = HttpConnection.timeout(millis);
        assertNotNull(conn.request());
        assertTrue(conn.request().timeout(millis));
    }

}