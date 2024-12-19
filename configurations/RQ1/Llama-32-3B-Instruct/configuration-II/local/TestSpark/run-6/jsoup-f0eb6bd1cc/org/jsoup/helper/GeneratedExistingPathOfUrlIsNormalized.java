package org.jsoup.helper;

public class GeneratedExistingPathOfUrlIsNormalized {

    @Test
    public void existingPathOfUrlIsNormalized() {
        String expectedPath = "/path/";
        URL url = new URL("http://example.com" + expectedPath);
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(expectedPath, url.getPath().replaceFirst("^/", ""));
    }

}