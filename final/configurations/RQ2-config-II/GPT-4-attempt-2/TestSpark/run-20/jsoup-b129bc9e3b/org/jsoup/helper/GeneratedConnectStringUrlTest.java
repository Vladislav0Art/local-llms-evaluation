package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConnectStringUrlTest {

    @Test
    public void connectStringUrlTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

}