package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedReferrer {

    @Test
    public void referrer() {
        String referrer = "Referer";
        Connection conn = HttpConnection.referrer(referrer);
        assertNotNull(conn.request());
        assertEquals(referrer, conn.request().header(Connection.Header.REFERER));
    }

}