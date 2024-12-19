package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_Fragment {

    @Test
    public void testAppendKeyVal_Fragment() {
        UrlBuilder builder = new UrlBuilder("http://example.com/path?query=a=1#fragment");
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        assertEquals("http://example.com/path?a%3D1%23fragment", builder.build().toString());
    }

}