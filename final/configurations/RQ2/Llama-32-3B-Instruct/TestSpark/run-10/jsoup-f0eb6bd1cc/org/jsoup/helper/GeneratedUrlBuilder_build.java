package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedUrlBuilder_build {

    @Test
    public void UrlBuilder_build() {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertTrue(builder.build().toString().startsWith("https://www.example.com/"));
    }

}