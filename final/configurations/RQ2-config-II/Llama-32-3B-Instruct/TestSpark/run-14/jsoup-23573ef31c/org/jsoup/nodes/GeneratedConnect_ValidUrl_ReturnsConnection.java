package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.select.Elements;

public class GeneratedConnect_ValidUrl_ReturnsConnection {

    @Test
    public void connect_ValidUrl_ReturnsConnection() {
        String url = "https://example.com";
        Connection connection = Jsoup.connect(url);
        assertNotNull(connection);
        assertEquals(url, connection.url());
    }

}