package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

import org.mockito.Mockito;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() throws URISyntaxException {
        UrlBuilder builder = new UrlBuilder();
        URL url = new URL(builder.buildUrl());
        assertThrows(URISyntaxException.class, () -> new URL(buildUrl()));
    }

}