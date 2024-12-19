package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_12 {

    @Test
    public void testAppendKeyVal_12() {
        UrlBuilder builder = new UrlBuilder("https://example.com/path&a=1&b=2%26%3F");
        assertEquals(builder.build(), "https%3A//example.com/path%20a%3D1%26%3Ab%3D2%26%3F");
    }

}