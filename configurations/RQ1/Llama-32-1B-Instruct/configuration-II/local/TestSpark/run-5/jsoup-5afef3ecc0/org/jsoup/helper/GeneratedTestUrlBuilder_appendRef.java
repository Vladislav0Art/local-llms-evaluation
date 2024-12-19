package org.jsoup.helper;

public class GeneratedTestUrlBuilder_appendRef {

    @Test
    public void testUrlBuilder_appendRef() {
        // Test case for appendRef method with a reference string
        UrlBuilder builder = new URLBuilder(new URI("https://example.com/path?query=value"));
        String expectedRef = "#expected_ref";
        assertEquals(expectedRef, builder.q.toString());
    }

}