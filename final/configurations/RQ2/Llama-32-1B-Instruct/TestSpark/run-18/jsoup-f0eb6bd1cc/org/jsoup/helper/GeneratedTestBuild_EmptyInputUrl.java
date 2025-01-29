package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.BeforeEach;
import org.junit.Test;

public class GeneratedTestBuild_EmptyInputUrl {

    @BeforeEach
    public void setUp() {
        urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void testBuild_EmptyInputUrl() {
        String inputUrl = "";
        assertEquals("", urlBuilder.build());
    }

}