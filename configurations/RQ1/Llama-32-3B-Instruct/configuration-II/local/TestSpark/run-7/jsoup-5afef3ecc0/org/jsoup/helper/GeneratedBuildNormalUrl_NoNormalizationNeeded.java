package org.jsoup.helper;

public class GeneratedBuildNormalUrl_NoNormalizationNeeded {

    @Test
    public void buildNormalUrl_NoNormalizationNeeded() {
        // Given
        URL inputUrl = new URL("https://example.com/path");

        // When
        URL expectedUrl = new URL(inputUrl.toExternalForm());
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Then
        assertEquals(expectedUrl, urlBuilder.build());
    }

}