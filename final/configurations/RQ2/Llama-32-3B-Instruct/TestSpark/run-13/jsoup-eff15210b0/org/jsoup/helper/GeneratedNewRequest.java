package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedNewRequest {

    @Test
    public void newRequest() {
        Connection conn = HttpConnection.newRequest();
        assertNotNull(conn);
        assertTrue(conn instanceof Connection);
    }

}