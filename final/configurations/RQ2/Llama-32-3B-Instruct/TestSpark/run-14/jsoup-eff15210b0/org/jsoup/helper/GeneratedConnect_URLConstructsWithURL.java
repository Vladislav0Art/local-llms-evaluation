package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URL;

public class GeneratedConnect_URLConstructsWithURL {

    @Test
    public void connect_URLConstructsWithURL() throws MalformedURLException, IOException {
        URL url = new URL("http://www.example.com");
        Connection connection = HttpConnection.connect(url);
        assertEquals(url, connection.url());
    }

}