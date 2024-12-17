package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_MalformedQuery {

    public static void main(String[] args) {
        String input = "http://example.com/path?query=value";
        URLBuilder builder = new UrlBuilder(new URI("http://example.com/path"));
        Connection.KeyVal kv1 = new Connection.KeyVal("key", "value");

        System.out.println(builder.appendKeyVal(kv1));
    }

    @Test
    public void testAppendKeyVal_MalformedQuery() {
        String expected = "http://example.com/path?query=abc";
        URLBuilder builder = new UrlBuilder(new URI("http://example.com/path"));
        Connection.KeyVal kv1 = new Connection.KeyVal("key", "value");

        try {
            System.out.println(builder.appendKeyVal(kv1));
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }

}