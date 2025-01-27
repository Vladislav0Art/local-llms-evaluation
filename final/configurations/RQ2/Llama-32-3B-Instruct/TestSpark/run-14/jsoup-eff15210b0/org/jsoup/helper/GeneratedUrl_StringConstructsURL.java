package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URL;

public class GeneratedUrl_StringConstructsURL {

    @Test
    public void url_StringConstructsURL() throws MalformedURLException, IOException {
        URL url = new URL("http://www.example.com");
        Connection connection = HttpConnection.url(url);
        assertEquals(url, connection.url());
    }

}