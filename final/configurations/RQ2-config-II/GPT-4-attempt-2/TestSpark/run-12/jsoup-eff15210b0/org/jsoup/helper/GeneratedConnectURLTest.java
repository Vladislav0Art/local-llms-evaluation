package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConnectURLTest {

    @Test
    public void connectURLTest() {
        URL url = new URL("http://testurl.com");
        Connection connection = HttpConnection.connect(url);
        assertNotNull("Connection should not be null", connection);
    }

}