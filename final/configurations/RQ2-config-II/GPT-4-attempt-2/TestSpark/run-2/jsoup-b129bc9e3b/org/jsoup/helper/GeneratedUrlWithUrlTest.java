package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedUrlWithUrlTest {

    @Test
    public void urlWithUrlTest() throws Exception {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.url(new URL("https://www.example.com"));
        assertNotNull(connection);
    }

}