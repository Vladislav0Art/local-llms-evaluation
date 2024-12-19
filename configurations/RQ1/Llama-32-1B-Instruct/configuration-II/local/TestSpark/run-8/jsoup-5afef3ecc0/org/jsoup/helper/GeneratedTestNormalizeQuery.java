package org.jsoup.helper;

public class GeneratedTestNormalizeQuery {

    @Test
    public void testNormalizeQuery() throws UnsupportedEncodingException {
        String query = "test=query";
        URLBuilder urlBuilder = new URLBuilder(new URL("https://example.com/path"));
        String normalizedQuery = urlBuilder.normalizeQuery(query);
        assertEquals("test%3Dquery", normalizedQuery);
    }

}