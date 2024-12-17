package org.jsoup.helper;

public class GeneratedTestEmptyQuery {

    @Test
    public void testEmptyQuery() {
        final URLBuilder builder = new UrlBuilder(new URL(""));
        assert builder.u == new URL("");
        String normalizedUrl = builder.build();
        assertEquals("https://example.com/", normalizedUrl);
    }

}