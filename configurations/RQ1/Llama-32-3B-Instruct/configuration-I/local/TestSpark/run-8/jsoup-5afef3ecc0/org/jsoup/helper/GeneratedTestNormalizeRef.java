package org.jsoup.helper;

public class GeneratedTestNormalizeRef {

    @Test
    public void testNormalizeRef() {
        String urlBuilder = new UrlBuilder();
        String r = "test ref";
        String expected = urlBuilder.normalizeRef(r);
        assertEquals(expected, "%20test%20ref");
    }
}

public class UrlBuilder {

    private String decoded;
    private String normalizedQuery;
    private String normalizedRef;

    public String decodePart(String encoded) {
        this.decoded = encoded;
        return encoded;
    }

    public String normalizeQuery(String q) {
        this.normalizedQuery = q;
        return q;
    }

    public String normalizeRef(String r) {
        this.normalizedRef = "%20" + r + "%20";
        return normalizedRef;
    }

}