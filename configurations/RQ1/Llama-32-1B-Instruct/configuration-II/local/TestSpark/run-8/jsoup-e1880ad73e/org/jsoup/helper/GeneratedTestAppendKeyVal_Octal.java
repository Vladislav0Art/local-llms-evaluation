package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_Octal {

    @Test
    public void testAppendKeyVal_Octal() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?query=a%2F8");
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals("http://example.com/path?a%3D1%2F8#fragment", builder.build().toString());
    }

}