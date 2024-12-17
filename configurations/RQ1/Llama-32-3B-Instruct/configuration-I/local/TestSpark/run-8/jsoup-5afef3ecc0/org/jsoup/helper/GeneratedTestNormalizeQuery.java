package org.jsoup.helper;

public class GeneratedTestNormalizeQuery {

    @Test
    public void testNormalizeQuery() {
        String urlBuilder = new UrlBuilder();
        String q = "+test+query";
        String expected = urlBuilder.normalizeQuery(q);
        assertEquals(expected, "+test+query");
    }

}