package org.jsoup.helper;

public class GeneratedTestUrlBuilder {

    public static String toString() {
        return "http://example.com";
    }
}

public class UrlBuilder {
    private String q;

    public UrlBuilder(URL url) {
        this.q = url.toString();
    }

    public void appendKeyVal(Connection.KeyVal kv) {
        // implement logic to add query parameter
    }

    public String getQ() {
        return q;
    }

    public static String decodePart(String part) {
        // implement URL decoding logic here
        return part;
    }
}

public class Test {

    @Test
    public void testUrlBuilder() {
        UrlBuilder builder = new UrlBuilder(new URL());
        assertEquals("http://example.com", builder.getQ());
    }

}