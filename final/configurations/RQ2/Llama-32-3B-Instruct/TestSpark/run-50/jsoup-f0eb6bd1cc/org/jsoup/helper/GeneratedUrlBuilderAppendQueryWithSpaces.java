package org.jsoup.helper;

public class GeneratedUrlBuilderAppendQueryWithSpaces {

    @Test
    public void urlBuilderAppendQueryWithSpaces() throws MalformedURLException, URISyntaxException {
        String expectedUrl = "http://example.com?query=value+with+spaces";
        URI uri = new URI("http://example.com").resolve("?query=value+with+spaces");
        UrlBuilder builder = new UrlBuilder(uri);
        assertEquals(expectedUrl, builder.build().toString());
    }
}

public class UrlBuilder {
    private URI uri;

    public UrlBuilder(URI uri) {
        this.uri = uri;
    }

    public String build() {
        // implement your logic here
    }

}