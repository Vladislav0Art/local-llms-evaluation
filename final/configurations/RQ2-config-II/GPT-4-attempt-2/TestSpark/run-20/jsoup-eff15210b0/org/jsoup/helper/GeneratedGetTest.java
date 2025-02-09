package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedGetTest {

    @Test
    public void getTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection.timeout(3000);
        connection.url("https://www.google.com");
        assertNotNull(connection.get());
    }

}