package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilderUrlBuilderWithQueryParameterTest {

    @Test
    public void urlBuilderUrlBuilderWithQueryParameterTest() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com?query=value"));
        assertEquals(new URL("http://example.com?query=value"), urlBuilder.build());
    }

}