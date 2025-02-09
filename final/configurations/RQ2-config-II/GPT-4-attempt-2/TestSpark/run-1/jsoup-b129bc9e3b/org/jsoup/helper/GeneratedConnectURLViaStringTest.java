package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.HttpConnection;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertNotNull;

public class GeneratedConnectURLViaStringTest {

    @Test
    public void connectURLViaStringTest() {
        HttpConnection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

}