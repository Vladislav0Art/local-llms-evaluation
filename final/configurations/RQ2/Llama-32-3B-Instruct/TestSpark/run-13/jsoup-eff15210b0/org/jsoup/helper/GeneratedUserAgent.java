package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedUserAgent {

    @Test
    public void userAgent() {
        String userAgent = "User-Agent";
        Connection conn = HttpConnection.userAgent(userAgent);
        assertNotNull(conn.request());
        assertEquals(userAgent, conn.request().header(Connection.Header.USER_AGENT));
    }

}