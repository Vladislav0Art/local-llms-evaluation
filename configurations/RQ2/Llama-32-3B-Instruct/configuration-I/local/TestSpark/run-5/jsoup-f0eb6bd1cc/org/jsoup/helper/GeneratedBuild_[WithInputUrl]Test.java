package org.jsoup.helper;

public class GeneratedBuild_[WithInputUrl]

Test {

    @Test
    public void build_[ WithInputUrl]Test() {
        String inputUrlStr = "http://example.com";
        URL inputUrl = new URL(inputUrlStr);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL(inputUrlStr);
        assertSame(expectedUrl, urlBuilder.build());
    }

}