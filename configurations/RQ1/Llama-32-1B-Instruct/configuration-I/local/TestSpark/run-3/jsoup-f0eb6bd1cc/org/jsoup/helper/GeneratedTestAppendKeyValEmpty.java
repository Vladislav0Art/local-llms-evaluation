package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyValEmpty {

    @Test
    public void testAppendKeyValEmpty() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path?query=value"));
        String[] results = {"http://example.com/path?value", "http://example.com/path"};
        for (String result : results) {
            sb.append(result).append("\n");
        }
        assertEquals(sb.toString(), builder.build().toString());
    }

}