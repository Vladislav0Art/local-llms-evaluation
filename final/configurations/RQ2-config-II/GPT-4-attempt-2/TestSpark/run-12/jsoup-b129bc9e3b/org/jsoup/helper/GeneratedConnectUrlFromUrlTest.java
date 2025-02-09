package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.URL;

public class GeneratedConnectUrlFromUrlTest {

    @Test
    public void connectUrlFromUrlTest() throws Exception {
        URL url = new URL("https://www.google.com");
        Connection connection = HttpConnection.connect(url);
        assertTrue(connection instanceof HttpConnection);
    }

}