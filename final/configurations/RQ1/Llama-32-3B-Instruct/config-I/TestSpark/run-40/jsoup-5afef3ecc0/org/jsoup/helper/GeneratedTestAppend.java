package org.jsoup.helper;

public class GeneratedTestAppend {

    public static StringBuilder borrowBuilder() {
        return new StringBuilder();
    }

    public static String append(String str, String q) {
        return str + q;
    }
}

public class UrlBuilder {
    private StringBuilder query;

    public UrlBuilder() {
        this.query = new StringBuilder();
    }

    public void setUrl(String url) {
        // implementation of setUrl
    }

    public String getQuery() {
        return query.toString();
    }

    public String normalizeQuery(String q) {
        return StringUtil.append("", q);
    }

    public static String decodePart(String part) {
        return part;  // no-op
    }
}

public class TestUrlBuilder {

    @Test
    public void testAppend() {
        UrlBuilder builder = new UrlBuilder();
        String expected = "{}";
        StringBuilder sb = StringUtil.borrowBuilder().append("a");
        String q = StringUtil.append("", sb);
        builder.setUrl("");
        builder.append(StringUtil.append("", q));
        assertEquals(expected, builder.getQuery());
    }

}