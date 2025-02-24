package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildTest {

    private static final String TEST_URL = "http://example.com/path?key1=val1&key2=val2";

    @Test
    public void buildTest() throws Exception {
        URL inputUrl = new URL(TEST_URL);
        UrlBuilder builder = new UrlBuilder(inputUrl);

        URL actualUrl = builder.build();
        assertEquals(TEST_URL, actualUrl.toString());
    }

}