package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;

public class GeneratedTestConnect {

    private static final String TEST_URL = "http://www.example.com";

    @Test
    public void testConnect() throws IOException {
        HttpConnection connection = HttpConnection.connect(TEST_URL);
        assertEquals(connection.request().url().toString(), TEST_URL);
    }

}