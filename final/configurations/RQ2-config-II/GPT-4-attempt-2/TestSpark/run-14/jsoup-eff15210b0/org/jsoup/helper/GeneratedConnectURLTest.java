package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConnectURLTest {

    @Test
    public void connectURLTest() throws Exception {
        Connection conn = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(conn);
    }

}