package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        String inputUrl = "https://example.com/path";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL url = builder.build();
        assertEquals("https://example.com/path", url.toString());
    }

}