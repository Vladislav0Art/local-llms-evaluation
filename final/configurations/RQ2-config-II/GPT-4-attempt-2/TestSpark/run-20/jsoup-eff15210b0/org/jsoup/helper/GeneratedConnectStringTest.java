package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedConnectStringTest {

    @Test
    public void connectStringTest() {
        Connection connection = HttpConnection.connect("https://www.google.com");
        assertNotNull(connection);
    }

}