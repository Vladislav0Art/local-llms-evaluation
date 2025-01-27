package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlFromInvalidInputUrlThrowsException {

    @org.powermock.modules.junit4.PowerMockRunner
    @org powermock.core.classloader.annotations.PrepareForTest(UrlBuilder .class)

    public void setUp() {
        // No setup needed
    }

    @Test
    public void buildUrlFromInvalidInputUrlThrowsException() throws Exception {
        UrlBuilder builder = new UrlBuilder();
        try {
            builder.build();
            assert false;
        } catch (Exception e) {
            assert true;
        }
    }

}