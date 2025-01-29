package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URLDecoder;

public class GeneratedTestAppendKeyVal_NaN {

    @Test
    public void testAppendKeyVal_NaN() {
        String key = "param1";
        Object value = Double.NaN;
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/path?param2=value2"));
        urlBuilder.appendKeyVal(java.util.Map.of(key, value));

        String expected = "http://example.com/path?param1=error&param2=value2";
        String actual = urlBuilder.build();
        assertEquals(expected, actual);
    }

}