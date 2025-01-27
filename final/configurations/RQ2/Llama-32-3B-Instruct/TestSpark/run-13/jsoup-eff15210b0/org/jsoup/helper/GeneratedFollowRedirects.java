package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedFollowRedirects {

    @Test
    public void followRedirects() {
        boolean followRedirects = true;
        Connection conn = HttpConnection.followRedirects(followRedirects);
        assertNotNull(conn.request());
        assertTrue(conn.request().followRedirects(followRedirects));
    }

}