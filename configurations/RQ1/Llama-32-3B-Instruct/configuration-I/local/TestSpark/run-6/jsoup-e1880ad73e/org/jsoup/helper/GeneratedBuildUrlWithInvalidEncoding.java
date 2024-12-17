package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedBuildUrlWithInvalidEncoding {

    @Test
    public void buildUrlWithInvalidEncoding() {
        URL u = new URL("http://example.com/path?key=value");
        UrlBuilder builder = new UrlBuilder(u);
        builder.build();
    }

}