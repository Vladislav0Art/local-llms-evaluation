package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestBuildWithoutAppendKeyVal {

    @Test
    public void testBuildWithoutAppendKeyVal() {
        String inputUrl = "https://example.com";
        URL url = new UrlBuilder(inputUrl).build();
        assertEquals("https://example.com", url);
    }

}