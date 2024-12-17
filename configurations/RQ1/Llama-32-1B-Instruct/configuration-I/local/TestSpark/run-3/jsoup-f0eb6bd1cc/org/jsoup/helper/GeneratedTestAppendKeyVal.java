package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path?query=value#fragment"));
        String[] results = {"http://example.com/path?query=value&fragment", "http://example.com/path?value&fragment"};
        for (String result : results) {
            sb.append(result).append("\n");
        }
        assertEquals(sb.toString(), builder.build().toString());
    }

}