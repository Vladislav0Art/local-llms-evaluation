package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        String inputUrl = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL actualUrl = urlBuilder.build();
        System.out.println(actualUrl.toString());
    }

}