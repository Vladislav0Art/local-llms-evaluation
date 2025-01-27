package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilderDecodeValueFromUrlTest {

    @Test
    public void urlBuilderDecodeValueFromUrlTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com?value=äöü"));
        assertEquals(new URL("http://example.com?value=%C3%A4%C3%B6%C3%BC"), urlBuilder.build());
    }

}