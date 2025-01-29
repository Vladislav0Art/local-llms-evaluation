package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestAppendKeyVal_NullMap {

    @Test
    public void testAppendKeyVal_NullMap() throws UnsupportedEncodingException {
        URL url = new URI("https://example.com/path");
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new java.util.HashMap<String, String>() {{
        }};
        assertNotNull(builder.build());
        assertEquals("", builder.build().toString());
    }

}