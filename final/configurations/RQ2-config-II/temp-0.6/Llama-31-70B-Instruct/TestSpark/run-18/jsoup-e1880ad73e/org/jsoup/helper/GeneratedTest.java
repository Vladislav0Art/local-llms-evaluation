package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void testBuild() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        assertNotNull(builder.build());
    }

    @Test
    public void testAppendKeyVal() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertNotNull(builder.build());
    }

}