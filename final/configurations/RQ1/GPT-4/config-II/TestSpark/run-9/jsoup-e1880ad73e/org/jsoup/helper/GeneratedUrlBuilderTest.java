package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedUrlBuilderTest {

    @Test
    public void UrlBuilderTest() throws Exception {
        URL inputUrl = new URL("http://test.com?query=value");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals("http://test.com?query=value", builder.u.toString());
        assertEquals("query=value", builder.q.toString());
    }

}