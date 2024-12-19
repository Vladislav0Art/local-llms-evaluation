package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_Diacritics {

    @Test
    public void testAppendKeyVal_Diacritics() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?query=a&#39;e");
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals("http://example.com/path?a%3D%22e%22#fragment", builder.build().toString());
    }

}