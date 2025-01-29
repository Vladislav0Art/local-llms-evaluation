package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedUrlBuilderUrl {

    @Test
    public void urlBuilderUrl() {
        String inputUrl = "https://example.com";
        URL outputUrl = new URLBuilder(inputUrl).build();
        assertEquals(inputUrl, outputUrl);
    }

}