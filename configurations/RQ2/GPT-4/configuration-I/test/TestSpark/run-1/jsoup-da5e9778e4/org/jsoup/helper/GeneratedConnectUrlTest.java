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

public class GeneratedConnectUrlTest {

    private final String TEST_URL = "https://httpbin.org/html";

    // Test default constructor

    @Test
    public void connectUrlTest() throws Exception {
        Connection connection = HttpConnection.connect(TEST_URL);
        assertNotNull(connection);
    }

}