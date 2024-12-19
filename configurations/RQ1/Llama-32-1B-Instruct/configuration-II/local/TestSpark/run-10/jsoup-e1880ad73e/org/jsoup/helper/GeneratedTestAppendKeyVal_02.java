package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_02 {

    @Test
    public void testAppendKeyVal_02() {
        UrlBuilder builder = new UrlBuilder("https://example.com/path/a=1&b=2");
        assertEquals(builder.build(), "https%3A//example.com/path/a%3D1&b%3D2%26%3F");
    }

}