package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyValNonAsciiMultiple {

    @Test
    public void testAppendKeyValNonAsciiMultiple() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder builder = new UrlBuilder(new URL("http://€€€example.com/path?€€€€€€query=&€€€&€€€€€€€&€€€€€€€€€fragment"));
        String[] results = {"http://€€€example.com/path?€€€€€€query=&€€€&€€€€€€€&€€€€€€€€€€€&€€€€€€€€€€fragment", "http://€€€example.com/path?€€€€€€€query=&€€€&€€€€€€€€&€€€€€€€€€€€€€€&€€€€€€€€€€fragment"};
        for (String result : results) {
            sb.append(result).append("\n");
        }
        assertEquals(sb.toString(), builder.build().toString());
    }

}