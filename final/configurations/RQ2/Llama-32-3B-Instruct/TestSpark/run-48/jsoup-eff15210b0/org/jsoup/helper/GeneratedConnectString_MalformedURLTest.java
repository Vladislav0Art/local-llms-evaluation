package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;

public class GeneratedConnectString_MalformedURLTest {

    @Test
    public void connectString_MalformedURLTest() {
        Connection conn = HttpConnection.connect("http://example ")
        assertNull(conn)
    }

}