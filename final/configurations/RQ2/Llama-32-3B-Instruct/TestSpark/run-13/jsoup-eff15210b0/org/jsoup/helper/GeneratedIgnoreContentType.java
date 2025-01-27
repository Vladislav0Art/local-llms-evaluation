package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedIgnoreContentType {

    @Test
    public void ignoreContentType() {
        boolean ignoreContentType = false;
        Connection conn = HttpConnection.ignoreContentType(ignoreContentType);
        assertNotNull(conn.request());
        assertFalse(conn.request().ignoreContentType(ignoreContentType));
    }

}