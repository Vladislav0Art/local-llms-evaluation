package org.jsoup.helper;

public class GeneratedBuild_throwsMalformedURLExceptionWhenNormalizationFails {

    @Test
    public void build_throwsMalformedURLExceptionWhenNormalizationFails() {
        assertThrows(MalformedURLException.class, () -> new UrlBuilder(null).build());
    }

}