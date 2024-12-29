package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedTestBuild_Simple {

    @Test
    public void testBuild_Simple() {
        String inputUrl = "https://example.com/path?a=b&c=d";
        URLBuilder builder = new UrlBuilder(inputUrl);
        assertTrue(builder.build().equals(new URI("https://example.com/path?a=b&c=d")));
    }

}