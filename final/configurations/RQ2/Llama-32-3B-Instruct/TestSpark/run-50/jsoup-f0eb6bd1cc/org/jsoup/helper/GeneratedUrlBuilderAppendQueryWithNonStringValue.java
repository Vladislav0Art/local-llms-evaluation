package org.jsoup.helper;

public class GeneratedUrlBuilderAppendQueryWithNonStringValue {

    @Test
    public void urlBuilderAppendQueryWithNonStringValue() throws MalformedURLException, URISyntaxException {
        String expectedUrl = "http://example.com?query=123";
        URI uri = new URI("http://example.com").resolve("?query=123");
        UrlBuilder builder = new UrlBuilder(uri);
        assertEquals(expectedUrl, builder.build().toString());
    }

}