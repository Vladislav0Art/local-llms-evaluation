package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URLDecoder;

public class GeneratedTestAppendKeyVal_URLEncoding {

    @Test
    public void testAppendKeyVal_URLEncoding() {
        String key = "param1";
        Object value = 123;
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/path?param2=value2"));
        urlBuilder.appendKeyVal(java.util.HashMap.of(key, value));

        String expected = "https%3A//example.com/path%23param1%3D%26param2%3D%26%27";
        String actual = urlBuilder.build();
        assertEquals(expected, actual);
    }

}