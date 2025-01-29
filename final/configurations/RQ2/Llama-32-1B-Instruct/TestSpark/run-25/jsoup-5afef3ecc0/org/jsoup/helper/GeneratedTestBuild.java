package org.jsoup.helper;

import org.junit.Test;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        String inputUrl = "https://example.com/path/to/resource";
        URLBuilder builder = new UrlBuilder(new URL(inputUrl));
        URL url = builder.build();
        assertNotNull(url);
        assertEquals("https://example.com/path/to/resource", url.toString());
    }

}