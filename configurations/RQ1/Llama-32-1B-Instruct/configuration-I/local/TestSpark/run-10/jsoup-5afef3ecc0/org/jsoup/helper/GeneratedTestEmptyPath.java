package org.jsoup.helper;

public class GeneratedTestEmptyPath {

    @Test
    public void testEmptyPath() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        String path = urlBuilder.getPath();
        assertEquals("", path);
    }

}