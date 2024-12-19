package org.jsoup.helper;

public class GeneratedTestAppendKeyValNoQueryAndRef {

    @Test
    public void testAppendKeyValNoQueryAndRef() {
        URLBuilder builder = new URLBuilder(new URI("https://example.com/path#ref"));
        builder.appendKeyVal(KeyVal.of("key", "value"));
        assertEquals("https%3A%2F%2Fexample%2Comath%23ref%26key%26value", builder.build().toString());
    }

}