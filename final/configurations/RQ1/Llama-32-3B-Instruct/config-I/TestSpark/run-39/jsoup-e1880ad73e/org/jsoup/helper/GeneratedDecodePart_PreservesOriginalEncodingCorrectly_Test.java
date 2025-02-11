package org.jsoup.helper;

public class GeneratedDecodePart_PreservesOriginalEncodingCorrectly_Test {

    @Test
    public void decodePart_PreservesOriginalEncodingCorrectly_Test() {
        // Arrange
        String encoded = "äöü";

        // Act
        String decoded = UrlBuilder.decodePart(encoded);

        // Assert
        assertEquals("äöü", decoded);
    }

}