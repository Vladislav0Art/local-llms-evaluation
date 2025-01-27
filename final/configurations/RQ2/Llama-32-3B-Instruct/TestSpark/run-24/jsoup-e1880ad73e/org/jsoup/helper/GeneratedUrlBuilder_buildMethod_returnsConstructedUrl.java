package org.jsoup.helper;

public class GeneratedUrlBuilder_buildMethod_returnsConstructedUrl {

    @Test
    public void urlBuilder_buildMethod_returnsConstructedUrl() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("https://example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL constructedUrl = urlBuilder.build();
        assertEquals(inputUrl.getProtocol(), constructedUrl.getProtocol());
    }

}