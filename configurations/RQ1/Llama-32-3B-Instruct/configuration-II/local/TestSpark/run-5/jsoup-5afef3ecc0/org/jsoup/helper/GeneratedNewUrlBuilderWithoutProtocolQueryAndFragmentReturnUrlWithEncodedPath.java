package org.jsoup.helper;

public class GeneratedNewUrlBuilderWithoutProtocolQueryAndFragmentReturnUrlWithEncodedPath {

    @Test
    public void newUrlBuilderWithoutProtocolQueryAndFragmentReturnUrlWithEncodedPath() {
        URL inputUrl = new URL("http://example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, urlBuilder.u);
    }

}