package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;

public class GeneratedBuildUrlEmptyPath_QueryFragment {

    @Test
    public void buildUrlEmptyPath_QueryFragment() {
        URL inputUrl = new URL("http://example.com#fragment");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertNotNull(result);
        assertEquals("http://example.com#fragment", result.getProtocol() + "://" + result.getHost());
    }

}