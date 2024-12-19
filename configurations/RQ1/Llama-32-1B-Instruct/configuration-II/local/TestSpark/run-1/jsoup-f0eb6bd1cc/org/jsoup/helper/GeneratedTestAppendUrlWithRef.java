package org.jsoup.helper;

public class GeneratedTestAppendUrlWithRef {

    @Test
    public void testAppendUrlWithRef() {
        URLBuilder builder = new URLBuilder(new URI("https://example.com/path#ref"));
        assertEquals("https%3A%2F%2Fexample%2Comath%23ref", builder.build().toString());
    }

}