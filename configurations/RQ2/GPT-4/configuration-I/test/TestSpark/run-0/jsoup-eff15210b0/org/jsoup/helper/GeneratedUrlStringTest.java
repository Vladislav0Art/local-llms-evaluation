package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedUrlStringTest {

    @Test
    public void urlStringTest() {
        Connection connection = new HttpConnection();
        assertNotNull(connection.url("http://example.com"));
    }

}