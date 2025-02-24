package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;

import static org.junit.Assert.*;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        URL inputUrl = null;
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertNull(result);
    }

}