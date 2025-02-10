package org.jsoup.helper;

public class GeneratedUrlBuilderBuildWithValidUrlTest {

    @Test
    public void urlBuilderBuildWithValidUrlTest() throws MalformedURLException {
        String expectedUrl = "http://example.com";
        URL url = new URL(expectedUrl);
        UrlBuilder builder = new UrlBuilder(url.toURI());
        assertEquals(expectedUrl, builder.build().toString());
    }

}