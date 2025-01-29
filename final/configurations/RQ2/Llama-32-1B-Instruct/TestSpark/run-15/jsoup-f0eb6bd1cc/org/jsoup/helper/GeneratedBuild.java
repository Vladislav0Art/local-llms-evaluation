package org.jsoup.helper;

public class GeneratedBuild {

    @Test
    public void build() {
        String inputUrl = "https://example.com/path";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        URI uri = outputUrl.toURI();
        assertEquals("https://example.com/path", uri.toString());
    }

}