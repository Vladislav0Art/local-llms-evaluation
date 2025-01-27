package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendKeyValToUrl {

    @org.powermock.modules.junit4.PowerMockRunner
    @org powermock.core.classloader.annotations.PrepareForTest(UrlBuilder .class)

    public void setUp() {
        // No setup needed
    }

    @Test
    public void appendKeyValToUrl() throws Exception {
        String inputUrl = "http://example.com";
        String key1 = "value1";
        String key2 = "value2";

        UrlBuilder builder = new UrlBuilder(inputUrl);

        builder.appendKeyVal(key1, key2);
        assertEquals("http://example.com?key1=value1", builder.inputUrl());

        builder.appendKeyVal(key2, "key3");
        assertEquals("http://example.com?key1=value1&key2=value2", builder.inputUrl());
    }

}