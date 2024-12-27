package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConnectUrlTest {

    @Test
    public void connectUrlTest() {
        HttpConnection connection = HttpConnection.connect("https://www.example.com");
        assertNotNull(connection);
    }

}