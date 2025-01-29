package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTestAppendKeyValEmptyArray {

    private UrlBuilder urlBuilder;
    private String inputUrl;

    @Test
    public void testAppendKeyValEmptyArray() {
        String[] kv = {};
        UrlBuilder.UrlBuilderTest(urlBuilder, kv);
        assertEquals("", urlBuilder.appendKeyVal(kv).toString());
    }

}