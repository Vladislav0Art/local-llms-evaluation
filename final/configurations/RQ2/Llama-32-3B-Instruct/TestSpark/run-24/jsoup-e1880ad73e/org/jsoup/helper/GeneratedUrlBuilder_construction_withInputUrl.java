package org.jsoup.helper;

public class GeneratedUrlBuilder_construction_withInputUrl {

    @Test
    public void urlBuilder_construction_withInputUrl() {
        URL inputUrl = new URL("https://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assert urlBuilder != null;
    }

}