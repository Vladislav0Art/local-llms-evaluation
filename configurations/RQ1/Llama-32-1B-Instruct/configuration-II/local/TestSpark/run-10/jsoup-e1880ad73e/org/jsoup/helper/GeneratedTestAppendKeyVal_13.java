package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_13 {

    @Test
    public void testAppendKeyVal_13() {
        UrlBuilder builder = new UrlBuilder("https://example.com/path?a=1&b=2#c=3");
        assertEquals(builder.build(), "https%3A//example.com/path%20a%3D1%26%3Ab%3D2%23%26%3Cc%3D3");
    }

}