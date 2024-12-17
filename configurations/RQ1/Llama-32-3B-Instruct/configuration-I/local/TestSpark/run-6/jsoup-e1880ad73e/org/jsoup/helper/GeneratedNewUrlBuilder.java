package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedNewUrlBuilder {

    @Test
    public void newUrlBuilder() {
        URL u = new URL("http://example.com/path");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(u, builder.u);
        assertNull(builder.q);
    }

}