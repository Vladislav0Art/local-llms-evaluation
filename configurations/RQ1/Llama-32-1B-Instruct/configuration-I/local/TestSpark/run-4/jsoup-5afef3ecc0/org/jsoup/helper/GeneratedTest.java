package org.jsoup.helper;

public class GeneratedTest {

    public static void main(String[] args) {
        String input = "http://example.com/path?query=value";
        URLBuilder builder = new UrlBuilder(new URI("http://example.com/path"));
        Connection.KeyVal kv1 = new Connection.KeyVal("key", "value");

        System.out.println(builder.appendKeyVal(kv1));
    }

    @Test
    public void testAppendKeyVal_SimpleCase() {
        String expected = "http://example.com/path?query=value";
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

    @Test
    public void testAppendKeyVal_EmptyQuery() {
        URLBuilder builder = new UrlBuilder(new URI("http://example.com/path"));
        Connection.KeyVal kv1 = new Connection.KeyVal("key", "value");

        System.out.println(builder.appendKeyVal(kv1));
    }

    @Test
    public void testAppendKeyVal_NullRef() {
        String expected = "http://example.com/path?query=value";
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

    @Test
    public void testAppendKeyVal_MalformedRef() {
        String expected = "http://example.com/path?ref=abc";
        URLBuilder builder = new UrlBuilder(new URI("http://example.com/path"));
        Connection.KeyVal kv1 = new Connection.KeyVal("key", "value");
        System.out.println(builder.appendKeyVal(kv1));
    }

    @Test
    public void testAppendKeyVal_MalformedURL() {
        String expected = "http://example.com/unknown/path?query=value";
        URLBuilder builder = new UrlBuilder(new URI("http://example.com/unknown"));
        Connection.KeyVal kv1 = new Connection.KeyVal("key", "value");

        System.out.println(builder.appendKeyVal(kv1));
    }

    @Test
    public void testAppendKeyVal_NoRef() {
        String expected = "http://example.com/path?query=value";
        URLBuilder builder = new UrlBuilder(new URI("http://example.com/path"));
        Connection.KeyVal kv1 = new Connection.KeyVal("key", "value");

        System.out.println(builder.appendKeyVal(kv1));
    }

}