package org.jsoup.helper;

public class GeneratedBuild_givenInvalidProtocol_throwsMalformedURLException {

    @Test
    public void build_givenInvalidProtocol_throwsMalformedURLException() {
        assertThrows(MalformedURLException.class, () -> new UrlBuilder(new URL("invalid://example.com/path?query=abc&def=ghi")));
    }

}