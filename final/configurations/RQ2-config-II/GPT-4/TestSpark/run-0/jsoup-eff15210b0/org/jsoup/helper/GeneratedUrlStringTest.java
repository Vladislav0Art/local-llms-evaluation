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

public class GeneratedUrlStringTest {

    @Test
    public void urlStringTest() {
        Connection connection = new HttpConnection().url("http://example.com");
        assertNotNull(connection);
    }

}