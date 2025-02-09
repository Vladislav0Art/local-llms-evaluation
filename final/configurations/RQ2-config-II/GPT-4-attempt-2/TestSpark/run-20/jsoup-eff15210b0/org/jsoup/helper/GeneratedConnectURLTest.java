package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedConnectURLTest {

    @Test
    public void connectURLTest() throws MalformedURLException {
        URL googleUrl = new URL("https://www.google.com");
        Connection connection = HttpConnection.connect(googleUrl);
        assertNotNull(connection);
    }

}