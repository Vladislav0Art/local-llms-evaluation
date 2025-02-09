package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.HttpConnection;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertNotNull;

public class GeneratedPostTest {

    @Test
    public void postTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection.url("http://example.com");
        assertNotNull(connection.post());
    }

}