package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestAppendKeyValReturnsUrlWithAppendKeyVal {

    @Test
    public void testAppendKeyValReturnsUrlWithAppendKeyVal() throws UnsupportedEncodingException, IOException {
        URLBuilder builder = new UrlBuilder("https://example.com");
        Map<String, String> map = builder.appendKeyVal("key", "value");
        assertEquals("https://example.com?key=value", mapper.toString());
    }

}