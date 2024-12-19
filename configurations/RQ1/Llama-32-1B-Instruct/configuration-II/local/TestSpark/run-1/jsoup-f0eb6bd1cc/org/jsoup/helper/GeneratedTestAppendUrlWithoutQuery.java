package org.jsoup.helper;

public class GeneratedTestAppendUrlWithoutQuery {

    @Test
    public void testAppendUrlWithoutQuery() {
        URLBuilder builder = new URLBuilder(new URI("https://example.com/path"));
        assertEquals("https%3A%2F%2Fexample%2Comath", builder.build().toString());
    }

}