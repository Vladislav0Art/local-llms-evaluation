package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws Exception {
        URL inputUrl = new URL("http://test.com?query=value");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.build();
        assertEquals("http://test.com?query=value", builder.u.toString());
    }

}