package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Request;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConnectURLTest {

    @Test
    public void connectURLTest() {
        URL url = new URL("http://example.com");
        HttpConnection connection = new HttpConnection(url);
        Connection expected = new HttpConnection();
        assertEquals(expected, connection.connect(url));
    }

}