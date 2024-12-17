package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_QueuesOnly {

    public static void main(String[] args) {
        String input = "http://example.com/path?query=value";
        URLBuilder builder = new UrlBuilder(new URI("http://example.com/path"));
        Connection.KeyVal kv1 = new Connection.KeyVal("key", "value");

        System.out.println(builder.appendKeyVal(kv1));
    }

    @Test
    public void testAppendKeyVal_QueuesOnly() {
        String expected = "http://example.com/path?query=value";
        URLBuilder builder = new UrlBuilder(new URI("http://example.com/path"));
        Connection.KeyVal kv1 = new Connection.KeyVal("key", "value");
        Connection.KeyVal kv2 = new Connection.KeyVal("otherKey", "otherValue");

        System.out.println(builder.appendKeyVal(kv1));
        System.out.println(builder.appendKeyVal(kv2));
    }

}