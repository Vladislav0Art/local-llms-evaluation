package org.jsoup.helper;

public class GeneratedNewUrlBuilderWithProtocolQueryAndFragmentReturnUrlWithEncodedPath {

    @Test
    public void newUrlBuilderWithProtocolQueryAndFragmentReturnUrlWithEncodedPath() {
        URL inputUrl = new URL("http://example.com/path?query=param#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, urlBuilder.u);
    }

}