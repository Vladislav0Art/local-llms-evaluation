package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilderEncodeValueForUrlWithQueryParameterTest {

    @Test
    public void urlBuilderEncodeValueForUrlWithQueryParameterTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com?query=value"));
        urlBuilder.appendKeyVal(Connection.KeyVal.of("key", "äöü"));
        assertEquals(new URL("http://example.com?key=%C3%A4%C3%B6%C3%BC&query=value"), urlBuilder.build());
    }

}