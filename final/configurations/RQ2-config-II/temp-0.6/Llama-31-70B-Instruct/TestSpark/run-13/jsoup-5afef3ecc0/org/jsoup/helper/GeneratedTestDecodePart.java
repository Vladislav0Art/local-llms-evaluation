package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestDecodePart {

    @Test
    public void testDecodePart() {
        // Given
        String encodedPart = "encoded%20part";
        // When
        String decodedPart = UrlBuilder.decodePart(encodedPart);
        // Then
        assertEquals("encoded part", decodedPart);
    }

}