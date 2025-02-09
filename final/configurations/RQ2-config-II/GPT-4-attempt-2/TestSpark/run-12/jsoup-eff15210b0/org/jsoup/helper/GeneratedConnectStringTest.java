package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConnectStringTest {

    @Test
    public void connectStringTest() {
        String url = "http://testurl.com";
        Connection connection = HttpConnection.connect(url);
        assertNotNull("Connection should not be null", connection);
    }

}