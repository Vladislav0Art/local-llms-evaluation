package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        String url = "https://example.com/path/to/resource";
        URL result = UrlBuilder.build(url);
        assertEquals("https://example.com/path/to/resource", result.toString());
    }

}