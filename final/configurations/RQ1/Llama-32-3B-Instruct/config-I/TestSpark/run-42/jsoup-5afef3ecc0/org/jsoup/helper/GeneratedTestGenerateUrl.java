package org.jsoup.helper;

public class GeneratedTestGenerateUrl {

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
    public void testGenerateUrl() {
        UrlHelper.UrlHelper = new UrlHelper();
        String url = UrlHelper.UrlHelper.generateUrl("test-path");
        Assert.assertNotNull(url);
    }

}