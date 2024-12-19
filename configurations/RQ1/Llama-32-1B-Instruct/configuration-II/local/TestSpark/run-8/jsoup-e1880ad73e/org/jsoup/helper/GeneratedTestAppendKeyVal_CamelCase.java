package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_CamelCase {

    @Test
    public void testAppendKeyVal_CamelCase() {
        UrlBuilder builder = new UrlBuilder("http://example.com/Path?query=a=1#fragment");
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals("http://example.com/path?a%3D1#fragment", builder.build().toString());
    }

}