package org.jsoup.helper;

public class GeneratedBuildUrlTest_WithValidUrlInput {

    @Test
    public void buildUrlTest_WithValidUrlInput() {
        String url = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(url));
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals(url, result.toString());
    }

}