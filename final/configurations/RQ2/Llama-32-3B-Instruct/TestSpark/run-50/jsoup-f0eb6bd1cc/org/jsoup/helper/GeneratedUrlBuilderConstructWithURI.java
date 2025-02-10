package org.jsoup.helper;

public class GeneratedUrlBuilderConstructWithURI {

    @Test
    public void urlBuilderConstructWithURI() throws URISyntaxException {
        String expectedUrl = "http://example.com";
        URI uri = new URI(expectedUrl);
        UrlBuilder builder = new UrlBuilder(uri);
        assertNotNull(builder);
    }

}