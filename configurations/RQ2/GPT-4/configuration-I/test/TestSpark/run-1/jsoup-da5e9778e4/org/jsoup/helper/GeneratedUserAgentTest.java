package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedUserAgentTest {

    private final String TEST_URL = "https://httpbin.org/html";

    // Test default constructor

    @Test
    public void userAgentTest() {
        Connection connection = Jsoup.connect(TEST_URL).userAgent("Mozilla");
        assertEquals("Mozilla", connection.request().userAgent());
    }

}