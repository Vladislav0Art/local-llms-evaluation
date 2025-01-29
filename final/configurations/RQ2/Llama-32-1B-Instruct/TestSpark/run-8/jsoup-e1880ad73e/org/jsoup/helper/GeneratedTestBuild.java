package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://www.example.com"));
        assertEquals(new URL("https://www.example.com"), urlBuilder.build());
    }

}