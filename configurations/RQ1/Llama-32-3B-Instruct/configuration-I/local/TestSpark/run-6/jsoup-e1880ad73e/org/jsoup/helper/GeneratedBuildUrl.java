package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedBuildUrl {

    @Test
    public void buildUrl() {
        URL u = new URL("http://example.com/path?key=value&space+as+plus#anchor");
        UrlBuilder builder = new UrlBuilder(u);
        builder.build();
        URI uri = u.getURI();
        assertEquals("http://example.com/path", uri.getHost());
        assertEquals("value", uri.getQuery().getValues().iterator().next());
    }

}