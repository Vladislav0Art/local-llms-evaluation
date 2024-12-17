package org.jsoup.helper;

public class GeneratedBuildWithProtocolAndHostWithoutQueryOrFragmentThrowsMalformedURLException {

    @Test
    public void buildWithProtocolAndHostWithoutQueryOrFragmentThrowsMalformedURLException() throws Exception {
        URL inputUrl = new URL("http://example.com/path");
        assertThrows(MalformedURLException.class, () -> UrlBuilder.newUrlBuilder(inputUrl));
    }

}