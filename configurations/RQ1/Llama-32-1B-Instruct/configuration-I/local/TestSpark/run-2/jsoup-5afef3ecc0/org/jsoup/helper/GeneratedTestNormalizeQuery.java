package org.jsoup.helper;

public class GeneratedTestNormalizeQuery {

    @Test
    public void testNormalizeQuery() {
        String inputQuery = "query=string&ref=%20";
        String expectedNormalizedQuery = "query=string&ref=%20";

        String normalizedQuery = UrlBuilder.normalizeQuery(inputQuery);
        assert normalizedQuery.equals(expectedNormalizedQuery);

        String queryEncoded = UrlHelper.URLEncoder.encode(normalizedQuery, UTF_8.name());
        String expectedEncoded = "%3Astring%26ref%3D%2F20";
        String expectedDecoded = "query=string&ref=%20";
        assert queryEncoded.equals(expectedEncoded);
    }

}