package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedConnectStringTest {

    @Test
    public void connectStringTest() {
        HttpConnection connection = HttpConnection.connect("https://www.example.com");
        assertEquals("https://www.example.com", connection.request().url().toString());
    }

}