package org.jsoup.helper;

public class GeneratedNormalizeQuery_WithSpaces {

    @Test
    public void normalizeQuery_WithSpaces() {
        // Given
        String q = "key value";
        StringBuilder expected = new StringBuilder("key+value");

        // When
        String normalQ = UrlBuilder.normalizeQuery(q);

        // Then
        assertEquals(expected, normalQ);
    }

}