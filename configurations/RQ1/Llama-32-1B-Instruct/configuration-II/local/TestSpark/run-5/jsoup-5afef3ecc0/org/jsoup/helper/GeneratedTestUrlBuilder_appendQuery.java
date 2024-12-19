package org.jsoup.helper;

public class GeneratedTestUrlBuilder_appendQuery {

    @Test
    public void testUrlBuilder_appendQuery() {
        // Test case for appendQuery method with a query string
        UrlBuilder builder = new URLBuilder(new URI("https://example.com/path?query=value"));
        String expectedQuery = "?expected_query";
        assertEquals(expectedQuery, builder.q.toString());
    }

}