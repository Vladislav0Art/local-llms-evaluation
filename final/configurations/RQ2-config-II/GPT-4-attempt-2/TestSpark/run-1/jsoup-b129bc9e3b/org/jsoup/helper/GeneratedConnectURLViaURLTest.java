package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.HttpConnection;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertNotNull;

public class GeneratedConnectURLViaURLTest {

    @Test
    public void connectURLViaURLTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        HttpConnection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

}