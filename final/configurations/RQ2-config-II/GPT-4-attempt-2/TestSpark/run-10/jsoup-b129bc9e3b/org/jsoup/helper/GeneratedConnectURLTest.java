package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedConnectURLTest {

    @Test
    public void connectURLTest() throws MalformedURLException {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(connection);
    }

}