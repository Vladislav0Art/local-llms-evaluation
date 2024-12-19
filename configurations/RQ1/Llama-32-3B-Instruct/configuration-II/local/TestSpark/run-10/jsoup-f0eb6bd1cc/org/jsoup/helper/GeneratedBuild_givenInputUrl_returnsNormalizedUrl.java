package org.jsoup.helper;

public class GeneratedBuild_givenInputUrl_returnsNormalizedUrl {

    @Test
    public void build_givenInputUrl_returnsNormalizedUrl() {
        // Given
        URL inputUrl = new URL("http://example.com/path?query=value#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // When
        URL normalizedUrl = urlBuilder.build();

        // Then
        assertEquals("http://example.com/path%3Fquery%3Dvalue#fragment", normalizedUrl.toString());
    }

}