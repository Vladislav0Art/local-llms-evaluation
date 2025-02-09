package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedConnectURLTest {

    @Test
    public void connectURLTest() throws Exception {
        URL url = new URL("http://www.google.com");
        Connection connection = HttpConnection.connect(url);

        assertTrue(connection instanceof Connection);
    }

}