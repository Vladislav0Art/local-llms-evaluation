package org.jsoup.helper;

public class GeneratedTestURLWithQueryParams {

    @Test
    public void testURLWithQueryParams() {
        String encodedValue = "param=value";
        URL url = new URL("http://example.com/path?param=" + encodedValue);
        assertEquals("http://example.com/path?param=value", url.toString());
    }
}

}