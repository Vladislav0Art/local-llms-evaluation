package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;

public class GeneratedBuildUrlEmptyPath_Query {

    @Test
    public void buildUrlEmptyPath_Query() {
        URL inputUrl = new URL("http://example.com?query=string");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertNotNull(result);
        assertEquals("http://example.com?query=string", result.getProtocol() + "://" + result.getHost());
    }

}