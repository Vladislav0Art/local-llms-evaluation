package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

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
    public void testAppendKeyVal() {
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.setKey("key");
        kv.setValue("value");
        UrlBuilder builder = new UrlBuilder(new URL());
        builder.appendKeyVal(kv);
        assertEquals("http://example.com?key=value", builder.getQ());
    }

}