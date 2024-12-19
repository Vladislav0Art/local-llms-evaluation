package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_TernaryOperator {

    @Test
    public void testAppendKeyVal_TernaryOperator() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?query=a=1&b=true");
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals("http://example.com/path?a%3D1&b%3Dtrue#fragment", builder.build().toString());
    }

}