package org.jsoup.helper;

public class GeneratedTestAppendKeyValNullReference {

    @Test
    public void testAppendKeyValNullReference() {
        URLBuilder builder = new URLBuilder("https://example.com/path?a=1&b=2");
        builder.appendKeyVal(null);
        assert assertEquals("&a=1&b=2", builder.build().getQuery());
    }

}