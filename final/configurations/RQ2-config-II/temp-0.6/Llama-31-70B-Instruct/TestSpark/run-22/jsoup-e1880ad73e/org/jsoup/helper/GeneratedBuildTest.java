package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        URL url = null;
        try {
            url = new URL("https://example.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        assertEquals(url, urlBuilder.build());
    }

}