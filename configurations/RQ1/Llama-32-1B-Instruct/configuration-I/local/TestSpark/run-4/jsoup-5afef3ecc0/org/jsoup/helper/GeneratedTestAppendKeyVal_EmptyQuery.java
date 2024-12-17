package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_EmptyQuery {

    public static void main(String[] args) {
        String input = "http://example.com/path?query=value";
        URLBuilder builder = new UrlBuilder(new URI("http://example.com/path"));
        Connection.KeyVal kv1 = new Connection.KeyVal("key", "value");

        System.out.println(builder.appendKeyVal(kv1));
    }

    @Test
    public void testAppendKeyVal_EmptyQuery() {
        URLBuilder builder = new UrlBuilder(new URI("http://example.com/path"));
        Connection.KeyVal kv1 = new Connection.KeyVal("key", "value");

        System.out.println(builder.appendKeyVal(kv1));
    }

}