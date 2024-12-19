package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void buildUrl_[
    Scenario1]

    Test() {
        URL u = new URL("http://example.com/path/to/resource");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("http://example.com/path%2Fto%2Fresource"), builder.build());
    }

    @Test
    public void buildUrl_[
    Scenario2]

    Test() {
        URL u = new URL("http://example.com/path/to/resource?query=param&more=query");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("http://example.com/path%2Fto%2Fresource"), builder.build());
    }

    @Test
    public void buildUrl_[
    Scenario3]

    Test() {
        URL u = new URL("http://example.com/path/to/resource#fragment");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("http://example.com/path%2Fto%2Fresource"), builder.build());
    }

    @Test
    public void buildUrl_[
    Scenario4]

    Test() {
        URL u = new URL("http://example.com/path/to/resource?query=param&more=query#fragment");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals(new URL("http://example.com/path%2Fto%2Fresource"), builder.build());
    }

    @Test
    public void appendKeyVal_[
    Scenario1]

    Test() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path/to/resource"));
        builder.appendKeyVal(kv);
        assertEquals("?key=value", builder.q.toString());
    }

    @Test
    public void appendKeyVal_[
    Scenario2]

    Test() {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path/to/resource"));
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertEquals("?key1=value1&key2=value2", builder.q.toString());
    }

    @Test
    public void appendToAscii_[
    Scenario1]

    Test() {
        String s = "test";
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path/to/resource"));
        StringBuilder sb = new StringBuilder();
        appendToAscii(s, true, sb);
        assertEquals("%20", sb.toString());
    }

    @Test
    public void appendToAscii_[
    Scenario2]

    Test() {
        String s = "test";
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path/to/resource"));
        StringBuilder sb = new StringBuilder();
        appendToAscii(s, false, sb);
        assertEquals("%20", sb.toString());
    }

    @Test
    public void decodePart_[
    Scenario1]

    Test() {
        String encoded = "test";
        assertEquals("test", decodePart(encoded));
    }

    @Test
    public void decodePart_[
    Scenario2]

    Test() throws UnsupportedEncodingException {
        String encoded = "test";
        assertEquals("test", decodePart(encoded));
    }

}