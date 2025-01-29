package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestAppendKeyVal_NonStringValue {

    @Test
    public void testAppendKeyVal_NonStringValue() throws UnsupportedEncodingException {
        String key = "foo";
        URL url = new URI("https://example.com/path?key=value");
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put(key, "bar");
        }});
        assertNotNull(builder.build());
        assertEquals("bar", builder.build().toString());
    }

}