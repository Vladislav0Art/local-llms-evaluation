package org.jsoup.helper;

public class GeneratedNormalizeQueryNormalQuery {

    @Test
    public void normalizeQueryNormalQuery() {
        String q = "test query";
        String normalized = UrlBuilder.normalizeQuery(q);
        assertEquals("+test+query", normalized);
    }

}