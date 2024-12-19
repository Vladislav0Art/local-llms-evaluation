package org.jsoup.helper;

public class GeneratedTestAppendKeyValNoRef {

    @Test
    public void testAppendKeyValNoRef() {
        URLBuilder builder = new URLBuilder(new URI("https://example.com/path"));
        builder.appendKeyVal(KeyVal.of("key", "value"));
        assertEquals("https%3A%2F%2Fexample%2Comath%26key%26value", builder.build().toString());
    }

}