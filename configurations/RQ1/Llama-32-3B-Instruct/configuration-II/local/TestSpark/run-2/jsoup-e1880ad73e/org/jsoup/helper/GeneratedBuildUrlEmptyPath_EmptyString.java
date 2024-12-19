package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;

public class GeneratedBuildUrlEmptyPath_EmptyString {

    @Test
    public void buildUrlEmptyPath_EmptyString() {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertNotNull(result);
        assertEquals("http://example.com", result.getProtocol() + "://" + result.getHost());
    }

}