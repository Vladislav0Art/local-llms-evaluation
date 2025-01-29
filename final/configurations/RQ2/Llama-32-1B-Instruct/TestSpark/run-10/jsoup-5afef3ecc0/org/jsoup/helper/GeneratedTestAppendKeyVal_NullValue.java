package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestAppendKeyVal_NullValue {

    @Test
    public void testAppendKeyVal_NullValue() throws UnsupportedEncodingException {
        URL url = new URI("https://example.com/path?key=value");
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new java.util.HashMap<String, String>() {{
            put("", null);
        }});
        assertNotNull(builder.build());
        assertEquals(null, builder.build().toString());
    }

}