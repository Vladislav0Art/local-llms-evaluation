package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedUrlStringTest {

    @Test
    public void urlStringTest() {
        HttpConnection connection = (HttpConnection) new HttpConnection().url("http://example.com");
        assertNotNull(connection);
    }

}