package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;

public class GeneratedCreateUrlBuilder_withoutQueryBuildsUrlWithoutQuery {

    @Test
    public void createUrlBuilder_withoutQueryBuildsUrlWithoutQuery() {
        URL url = new URL("https://example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("https://example.com/path", urlBuilder.build().toString());
    }

}