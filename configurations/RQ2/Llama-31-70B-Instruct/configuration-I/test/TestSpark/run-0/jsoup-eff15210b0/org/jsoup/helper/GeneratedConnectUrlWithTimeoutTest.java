package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConnectUrlWithTimeoutTest {

    @Test
    public void connectUrlWithTimeoutTest() {
        HttpConnection connection = HttpConnection.connect("https://www.example.com")
                .timeout(10000);
        assertNotNull(connection);
    }

}