package org.jsoup.helper;

public class GeneratedTestNormalizeQuery {

    @Test
    public void testNormalizeQuery() {
        String query = "key1=value1&key2=value2";
        String normalizedQuery = UrlBuilder.normalizeQuery(query);
        assertEquals("key1=value1&key2=value2", normalizedQuery);
    }

}