package org.jsoup.helper;

public class GeneratedCreateUrlBuilderWithInvalidProtocol {

    private UrlBuilder urlBuilder;

    @Test
    public void createUrlBuilderWithInvalidProtocol() {
        assertThrows(MalformedURLException.class, () -> new UrlBuilder(new URL("ftp://example.com/path")));
    }

}