package org.jsoup.helper;

public class GeneratedBuild_givenInputUrlWithNonAsciiPath_returnsNormalizedUrl {

    @Test
    public void build_givenInputUrlWithNonAsciiPath_returnsNormalizedUrl() {
        // Given
        URL inputUrl = new URL("http://example.com/äthling?query=value#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // When
        URL normalizedUrl = urlBuilder.build();

        // Then
        assertEquals("http://example.com/%C3%A4thling%3Fquery%3Dvalue#fragment", normalizedUrl.toString());
    }

}