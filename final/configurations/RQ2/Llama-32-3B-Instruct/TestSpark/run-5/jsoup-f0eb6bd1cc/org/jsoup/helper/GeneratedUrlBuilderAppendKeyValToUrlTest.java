package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilderAppendKeyValToUrlTest {

    @Test
    public void urlBuilderAppendKeyValToUrlTest() throws UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(Connection.KeyVal.of("key", "value"));
        assertEquals(new URL("http://example.com?key=value"), urlBuilder.build());
    }

}