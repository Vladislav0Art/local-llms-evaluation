package org.jsoup.helper;

public class GeneratedExistingQueryOfUrlIsNormalized {

    @Test
    public void existingQueryOfUrlIsNormalized() {
        String expectedQuery = "a=1&b=2";
        URL url = new URL("http://example.com/path?a=1&b=2");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(expectedQuery, builder.q.toString());
    }

}