package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_Quotes {

    @Test
    public void testAppendKeyVal_Quotes() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?query=a='quote'");
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals("http://example.com/path?a%3D%22quote%22#fragment", builder.build().toString());
    }

}