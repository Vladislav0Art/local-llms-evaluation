package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.HashMap;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() {
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assert urlBuilder.build().orElseThrow() == "https://example.com";
    }

}