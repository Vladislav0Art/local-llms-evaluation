package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() {
        URLBuilder builder = new URLBuilder(new URI("https://example.com/path#query"));
        builder.appendKeyVal(KeyVal.of("key", "value"));
        assertEquals("https%3A%2F%2Fexample%2Comath%23query%26key%26value", builder.build().toString());
    }

}