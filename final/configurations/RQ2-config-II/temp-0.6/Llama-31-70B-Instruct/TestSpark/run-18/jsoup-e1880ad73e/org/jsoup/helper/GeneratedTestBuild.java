package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GeneratedTestBuild {

    @Test
    public void testBuild() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        assertNotNull(builder.build());
    }

}