package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConnectUrlWithMaxBodySizeTest {

    @Test
    public void connectUrlWithMaxBodySizeTest() {
        HttpConnection connection = HttpConnection.connect("https://www.example.com")
                .maxBodySize(1000000);
        assertNotNull(connection);
    }

}