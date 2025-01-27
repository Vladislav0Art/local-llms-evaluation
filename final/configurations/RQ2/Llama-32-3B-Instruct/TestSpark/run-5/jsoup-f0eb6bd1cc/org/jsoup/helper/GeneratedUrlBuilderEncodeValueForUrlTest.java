package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilderEncodeValueForUrlTest {

    @Test
    public void urlBuilderEncodeValueForUrlTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(Connection.KeyVal.of("key", "äöü"));
        assertEquals(new URL("http://example.com?key=%C3%A4%C3%B6%C3%BC"), urlBuilder.build());
    }

}