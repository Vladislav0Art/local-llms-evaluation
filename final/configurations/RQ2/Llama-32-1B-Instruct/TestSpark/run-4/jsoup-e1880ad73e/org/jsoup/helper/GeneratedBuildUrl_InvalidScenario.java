package org.jsoup.helper;

public class GeneratedBuildUrl_InvalidScenario {

    @Test
    public void buildUrl_InvalidScenario() {
        try {
            new UrlBuilder("https://example.com/path? invalid key");
        } catch (UnsupportedEncodingException e) {
            // expected exception
        }
    }

}