package org.jsoup.helper;

public class GeneratedUrlBuilder Build_WithDefaultUrl_ReturnsUrl {

    @Test
    public void urlBuilder

    Build_WithDefaultUrl_ReturnsUrl() throws MalformedURLException {
        URL defaultUrl = new URL("http://localhost");
        UrlBuilder urlBuilder = new UrlBuilder(defaultUrl);
        assertNotNull(urlBuilder.build());
    }

}