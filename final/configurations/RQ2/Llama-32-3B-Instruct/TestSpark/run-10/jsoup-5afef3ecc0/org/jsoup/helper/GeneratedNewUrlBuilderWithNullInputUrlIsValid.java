package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNewUrlBuilderWithNullInputUrlIsValid {

    @org.powermock.modules.junit4.PowerMockRunner
    @org powermock.core.classloader.annotations.PrepareForTest(UrlBuilder .class)

    public void setUp() {
        // No setup needed
    }

    @Test
    public void newUrlBuilderWithNullInputUrlIsValid() throws Exception {
        UrlBuilder builder = new UrlBuilder(null);
        assertEquals("http://example.com", builder.inputUrl());
    }

}