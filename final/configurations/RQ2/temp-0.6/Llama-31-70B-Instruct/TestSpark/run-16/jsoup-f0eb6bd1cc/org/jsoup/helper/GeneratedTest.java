package org.jsoup.helper;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void buildTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        URL url = urlBuilder.build();
        assertNull(url);
    }

    @Test
    public void testBuild() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertNull(urlBuilder.build());
    }

}