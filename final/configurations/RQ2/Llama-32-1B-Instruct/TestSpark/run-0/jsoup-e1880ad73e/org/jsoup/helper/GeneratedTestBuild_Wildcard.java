package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GeneratedTestBuild_Wildcard {

    @Test
    public void testBuild_Wildcard() {
        String inputUrl = "https://example.com/path?a=b&c=d";
        URLBuilder builder = new UrlBuilder(inputUrl);
        assertTrue(builder.build().equals(new URI("https://example.com/path?key1=value1[key2]=value2")));
    }

}