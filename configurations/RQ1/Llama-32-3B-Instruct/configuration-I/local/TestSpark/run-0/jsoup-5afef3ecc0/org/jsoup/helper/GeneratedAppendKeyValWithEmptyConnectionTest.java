package org.jsoup.helper;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyValWithEmptyConnectionTest {

    @Test
    public void appendKeyValWithEmptyConnectionTest() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(null);
        assertNotNull(builder.q);
        assertEquals(1, builder.q.length());
    }

}