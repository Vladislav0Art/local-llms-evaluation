package org.jsoup.helper;

public class GeneratedBuildUrlWorksCorrectly {

    @Test
    public void buildUrlWorksCorrectly() throws MalformedURLException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        String expectedUrl = "http://example.com";
        assertEquals(expectedUrl, builder.build().toString());
    }

}