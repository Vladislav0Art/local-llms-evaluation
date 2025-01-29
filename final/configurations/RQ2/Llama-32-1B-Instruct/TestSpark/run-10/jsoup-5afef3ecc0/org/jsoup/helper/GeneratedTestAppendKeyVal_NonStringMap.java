package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestAppendKeyVal_NonStringMap {

    @Test
    public void testAppendKeyVal_NonStringMap() throws UnsupportedEncodingException {
        URL url = new URI("https://example.com/path?key=value");
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put(1, "value");
        }});
        assertNotNull(builder.build());
        assertEquals("1=value", builder.build().toString());
    }

}