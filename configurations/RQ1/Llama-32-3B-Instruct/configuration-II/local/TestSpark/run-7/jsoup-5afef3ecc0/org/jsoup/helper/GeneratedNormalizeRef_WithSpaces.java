package org.jsoup.helper;

public class GeneratedNormalizeRef_WithSpaces {

    @Test
    public void normalizeRef_WithSpaces() {
        // Given
        String r = "ref with spaces";
        String expected = "%20ref%20with%20spaces";

        // When
        String normalR = UrlBuilder.normalizeRef(r);

        // Then
        assertEquals(expected, normalR);
    }

}