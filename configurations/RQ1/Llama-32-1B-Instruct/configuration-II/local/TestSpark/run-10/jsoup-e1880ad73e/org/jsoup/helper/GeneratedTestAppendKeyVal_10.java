package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_10 {

    @Test
    public void testAppendKeyVal_10() {
        UrlBuilder builder = new UrlBuilder("https://example.com/path&a=1&b=2%20c=3");
        assertEquals(builder.build(), "https%3A//example.com/path%20a%3D1%26%3Ab%3D2%2520%c%3D3");
    }

}