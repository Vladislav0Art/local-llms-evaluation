package org.jsoup.helper;

public class GeneratedTestNormalizeQuery {

    private static final String BaseUrl = "http://example.com";

    public static String generateUrl(String path) {
        return BaseUrl + "/" + path;
    }

    public static String decodePart(String part) throws UnsupportedEncodingException {
        // implementation of decode part
        return new String(part.getBytes(), "UTF-8");
    }

    public static String normalizeQuery(String query) {
        // implementation of normalize query
        return query;
    }

    public static String normalizeRef(String ref) {
        // implementation of normalize ref
        return "/refs/" + ref;
    }
}

public class TestUrlHelper {

    @Test
    public void testNormalizeQuery() {
        String query = "key1=value1&key2=value2";
        String normalizedQuery = UrlHelper.normalizeQuery(query);
        Assert.assertEquals(query, normalizedQuery);
    }

}