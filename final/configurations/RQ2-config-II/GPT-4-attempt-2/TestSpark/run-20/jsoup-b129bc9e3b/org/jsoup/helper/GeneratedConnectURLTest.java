package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConnectURLTest {

    @Test
    public void connectURLTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(connection);
    }

}