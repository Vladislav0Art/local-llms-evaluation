package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConnectStringTest {

    @Test
    public void connectStringTest() {
        Connection conn = HttpConnection.connect("http://example.com");
        assertNotNull(conn);
    }

}