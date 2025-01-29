package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        String inputUrl = "https://example.com/path?param1=value1&param2=value2";
        URLBuilder builder = new UrlBuilder(inputUrl);
        URL url = builder.build();
        assertEquals("https://example.com/path?param1=value1&param2=value2", url.toString());
    }

}