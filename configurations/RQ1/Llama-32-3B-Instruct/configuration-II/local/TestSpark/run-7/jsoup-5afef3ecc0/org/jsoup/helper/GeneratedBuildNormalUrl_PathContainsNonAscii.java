package org.jsoup.helper;

public class GeneratedBuildNormalUrl_PathContainsNonAscii {

    @Test
    public void buildNormalUrl_PathContainsNonAscii() {
        // Given
        URL inputUrl = new URL("https://example.com/áthás");
        StringBuilder q = new StringBuilder();

        // When
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String expectedPath = "áthás";
        urlBuilder.build();

        // Then
        assertEquals(expectedPath, decodePart(urlBuilder.u.getPath()));
    }

}