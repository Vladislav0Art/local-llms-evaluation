package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;

public class GeneratedBuildUrlPathNonAsciiQueryFragment {

    @Test
    public void buildUrlPathNonAsciiQueryFragment() {
        URL inputUrl = new URL("http://example.com/path/with/non-ascii?query=string#fragment");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertNotNull(result);
        assertEquals("http://example.com/path/with/non-ascii?query=string#fragment", result.getProtocol() + "://" + result.getHost());
    }

}