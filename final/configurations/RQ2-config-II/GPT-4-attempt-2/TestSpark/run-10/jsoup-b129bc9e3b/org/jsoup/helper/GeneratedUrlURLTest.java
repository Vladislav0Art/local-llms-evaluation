package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedUrlURLTest {

    @Test
    public void urlURLTest() throws MalformedURLException {
        HttpConnection connection = (HttpConnection) new HttpConnection().url(new URL("http://example.com"));
        assertNotNull(connection);
    }

}