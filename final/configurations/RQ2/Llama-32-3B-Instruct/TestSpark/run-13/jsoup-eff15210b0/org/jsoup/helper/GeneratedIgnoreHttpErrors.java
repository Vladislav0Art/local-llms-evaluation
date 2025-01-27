package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedIgnoreHttpErrors {

    @Test
    public void ignoreHttpErrors() {
        boolean ignoreHttpErrors = true;
        Connection conn = HttpConnection.ignoreHttpErrors(ignoreHttpErrors);
        assertNotNull(conn.request());
        assertTrue(conn.request().ignoreHttpErrors(ignoreHttpErrors));
    }

}