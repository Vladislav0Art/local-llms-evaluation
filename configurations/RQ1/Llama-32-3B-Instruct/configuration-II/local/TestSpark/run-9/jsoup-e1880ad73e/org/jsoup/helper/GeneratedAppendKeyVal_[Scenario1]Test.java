package org.jsoup.helper;

public class GeneratedAppendKeyVal_[Scenario1]

Test {

    @Test
    public void appendKeyVal_[ Scenario1]Test() {
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path/to/resource"));
        builder.appendKeyVal(kv);
        assertEquals("?key=value", builder.q.toString());
    }

}