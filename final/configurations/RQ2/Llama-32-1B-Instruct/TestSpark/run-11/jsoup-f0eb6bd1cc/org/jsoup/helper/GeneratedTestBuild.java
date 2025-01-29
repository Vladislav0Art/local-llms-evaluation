package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URLDecoder;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        String inputUrl = "https://example.com/path?param1=value1&param2=value2";
        URL result = new UrlBuilder(new URL(inputUrl)).build();
        assertEquals("https://example.com/path", result.toURI().toString());
    }

}