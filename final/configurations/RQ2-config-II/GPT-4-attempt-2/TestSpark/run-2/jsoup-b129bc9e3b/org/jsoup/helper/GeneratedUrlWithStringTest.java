package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedUrlWithStringTest {

    @Test
    public void urlWithStringTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.url("https://www.example.com");
        assertNotNull(connection);
    }

}