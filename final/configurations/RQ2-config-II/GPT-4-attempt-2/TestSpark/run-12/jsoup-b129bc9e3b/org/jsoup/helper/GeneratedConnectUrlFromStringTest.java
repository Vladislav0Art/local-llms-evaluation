package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.URL;

public class GeneratedConnectUrlFromStringTest {

    @Test
    public void connectUrlFromStringTest() throws Exception {
        Connection connection = HttpConnection.connect("https://www.google.com");
        assertTrue(connection instanceof HttpConnection);
    }

}