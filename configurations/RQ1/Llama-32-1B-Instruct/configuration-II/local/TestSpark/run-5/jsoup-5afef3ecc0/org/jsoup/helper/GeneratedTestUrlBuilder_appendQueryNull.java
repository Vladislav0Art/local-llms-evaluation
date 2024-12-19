package org.jsoup.helper;

public class GeneratedTestUrlBuilder_appendQueryNull {

    @Test
    public void testUrlBuilder_appendQueryNull() {
        // Test case for appendQuery method with a null query string
        UrlBuilder builder = new URLBuilder(new URI("https://example.com/path"));
        String expectedQuery = "";
        assertEquals(expectedQuery, builder.q.toString());
    }

}