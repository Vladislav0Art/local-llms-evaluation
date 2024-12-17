package org.jsoup.helper;

public class GeneratedBuildWithProtocolAndHostWithoutQueryOrFragmentReturnsCorrectedUrlWithPunyCoding {

    @Test
    public void buildWithProtocolAndHostWithoutQueryOrFragmentReturnsCorrectedUrlWithPunyCoding() throws Exception {
        URL inputUrl = new URL("http://example.com/path");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertEquals("http://xn--fiq50a3l.xn--fiq50a3l.com/PATH", builder.build().toString());
    }

}