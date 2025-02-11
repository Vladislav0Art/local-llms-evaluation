package org.jsoup.helper;

public class Generated[UrlBuilder]

BuildTest_WorksCorrectly {

    @Test
    public void [UrlBuilder]BuildTest_WorksCorrectly() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://example.com/path?query#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("http://example.com/path");
        assertEquals(expectedUrl, urlBuilder.u);
    }

}