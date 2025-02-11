package org.jsoup.helper;

public class GeneratedNormalizeQuery_replacesSpacesWithPlusSigns {

    @Test
    public void normalizeQuery_replacesSpacesWithPlusSigns() {
        String q = "query string";
        String expected = "query%20string";
        assertEquals(expected, UrlBuilder.normalizeQuery(q));
    }

}