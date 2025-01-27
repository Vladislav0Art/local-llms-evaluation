package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilderAppendKeyValToUrlWithQueryParameterTest {

    @Test
    public void urlBuilderAppendKeyValToUrlWithQueryParameterTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com?query=value"));
        urlBuilder.appendKeyVal(Connection.KeyVal.of("key", "value"));
        assertEquals(new URL("http://example.com?key=value&query=value"), urlBuilder.build());
    }

}