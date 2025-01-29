package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTestAppendKeyValNullValue {

    private UrlBuilder urlBuilder;
    private String inputUrl;

    @Test
    public void testAppendKeyValNullValue() {
        String[] kv = {"key1", null};
        UrlBuilder.UrlBuilderTest(urlBuilder, kv);
        assertEquals("key1=undefined", urlBuilder.appendKeyVal(kv).toString());
    }

}