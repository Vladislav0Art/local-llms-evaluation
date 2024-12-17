package org.jsoup.helper;

public class GeneratedBuildWithProtocolAndHostWithoutQueryOrFragmentAndRefReturnsCorrectedUrl {

    @Test
    public void buildWithProtocolAndHostWithoutQueryOrFragmentAndRefReturnsCorrectedUrl() throws Exception {
        URL inputUrl = new URL("http://example.com/path#fragment");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals("http://xn--fiq50a3l.xn--fiq50a3l.com/PATH#fragment", builder.build().toString());
    }

}