package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class GeneratedUrlTest {

    @Test
    public void urlTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        Connection connection = new HttpConnection().url(url);
        assertNotNull(connection);
    }

}