package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilderUrlBuilderTest {

    @Test
    public void urlBuilderUrlBuilderTest() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        assertEquals(new URL("http://example.com"), urlBuilder.build());
    }

}