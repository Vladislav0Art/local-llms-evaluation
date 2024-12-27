package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedUrlTest {

    @Test
    public void urlTest() throws MalformedURLException {
        Connection connection = new HttpConnection();
        assertNotNull(connection.url(new URL("http://example.com")));
    }

}