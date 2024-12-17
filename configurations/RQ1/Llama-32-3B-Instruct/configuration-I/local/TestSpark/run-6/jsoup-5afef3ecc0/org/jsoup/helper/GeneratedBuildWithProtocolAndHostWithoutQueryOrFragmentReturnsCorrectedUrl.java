package org.jsoup.helper;

public class GeneratedBuildWithProtocolAndHostWithoutQueryOrFragmentReturnsCorrectedUrl {

    @Test
    public void buildWithProtocolAndHostWithoutQueryOrFragmentReturnsCorrectedUrl() throws Exception {
        URL inputUrl = new URL("http://example.com/path?query=value#fragment");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals("http://xn--fiq50a3l.xn--fiq50a3l.com/PATH?query=value#fragment", builder.build().toString());
    }

}