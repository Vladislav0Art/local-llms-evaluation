package org.jsoup.helper;

public class GeneratedNormalizeQueryEncodedQuery {

    @Test
    public void normalizeQueryEncodedQuery() throws UnsupportedEncodingException {
        String q = "%20test%20query";
        String normalized = UrlBuilder.normalizeQuery(q);
        assertEquals("%20test%20query", normalized);
    }

}