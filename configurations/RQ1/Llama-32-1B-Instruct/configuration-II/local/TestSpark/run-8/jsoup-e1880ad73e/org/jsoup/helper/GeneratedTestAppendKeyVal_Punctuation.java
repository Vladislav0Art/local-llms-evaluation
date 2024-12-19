package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_Punctuation {

    @Test
    public void testAppendKeyVal_Punctuation() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?query=a=1!');
                builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals("http://example.com/path?a%3D1#!fragment", builder.build().toString());
    }

}