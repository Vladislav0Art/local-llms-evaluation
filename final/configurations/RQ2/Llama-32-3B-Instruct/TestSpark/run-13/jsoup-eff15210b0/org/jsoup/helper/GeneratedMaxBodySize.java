package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedMaxBodySize {

    @Test
    public void maxBodySize() {
        int bytes = 1024;
        Connection conn = HttpConnection.maxBodySize(bytes);
        assertNotNull(conn.request());
        assertEquals(bytes, conn.request().maxBodySize(bytes));
    }

}