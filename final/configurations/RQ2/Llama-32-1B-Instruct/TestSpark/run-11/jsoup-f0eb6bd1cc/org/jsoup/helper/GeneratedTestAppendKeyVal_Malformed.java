package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URLDecoder;

public class GeneratedTestAppendKeyVal_Malformed {

    @Test
    public void testAppendKeyVal_Malformed() {
        String key = "param1";
        String value = "value1";
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/path?param2=value2"));
        urlBuilder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put(key, value);
        }});

        String expected = "http://example.com/path?param1=error";
        String actual = urlBuilder.build();
        assertEquals(expected, actual);
    }

}