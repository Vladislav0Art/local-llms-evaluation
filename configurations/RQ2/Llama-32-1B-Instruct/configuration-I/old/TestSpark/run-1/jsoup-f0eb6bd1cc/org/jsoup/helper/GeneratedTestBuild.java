package org.jsoup.helper;

import org.junit.Test;

import java.net.URL;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        String url = "https://example.com/path?query=param";
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL urlObject = urlBuilder.build();
        assertEquals(url, urlObject.toString());
    }

}