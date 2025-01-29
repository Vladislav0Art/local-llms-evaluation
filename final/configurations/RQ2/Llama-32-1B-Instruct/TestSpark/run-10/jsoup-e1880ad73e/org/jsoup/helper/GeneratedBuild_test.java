package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedBuild_test {

    @Test
    public void build_test() {
        String inputUrl = "https://example.com";
        URLBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertNotNull(result);
        URI uri = result.toURI();
        assertTrue(uri.getScheme().equals("https"));
        assertTrue(uri.getHost().contains("example.com"));
    }

}