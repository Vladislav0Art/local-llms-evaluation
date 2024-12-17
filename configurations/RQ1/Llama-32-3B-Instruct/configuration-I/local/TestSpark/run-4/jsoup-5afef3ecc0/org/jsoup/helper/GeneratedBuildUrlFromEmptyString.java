package org.jsoup.helper;

public class GeneratedBuildUrlFromEmptyString {

    @Test
    public void buildUrlFromEmptyString() {
        assertThrows(MalformedURLException.class, () -> new UrlBuilder(new URL("")));
    }

}