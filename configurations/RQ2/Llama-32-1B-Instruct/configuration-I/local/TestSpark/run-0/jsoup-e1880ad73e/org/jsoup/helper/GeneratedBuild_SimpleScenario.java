package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.URI;
import java.nio.charset.StandardCharsets;

public class GeneratedBuild_SimpleScenario {

    @Test
    public void build_SimpleScenario() {
        URL inputUrl = new URI("https://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        String url = builder.build().toString();
        assertEquals("https://example.com", url);
    }

}