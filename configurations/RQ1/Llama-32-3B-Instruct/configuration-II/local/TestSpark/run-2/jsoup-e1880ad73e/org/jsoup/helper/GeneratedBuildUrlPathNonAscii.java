package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;

public class GeneratedBuildUrlPathNonAscii {

    @Test
    public void buildUrlPathNonAscii() {
        URL inputUrl = new URL("http://example.co.uk/path/with/non-ascii");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertNotNull(result);
        assertEquals("http://example.co.uk/path/with/non-ascii", result.getProtocol() + "://" + result.getHost());
    }

}