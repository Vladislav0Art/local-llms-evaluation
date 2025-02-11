package org.jsoup.helper;

public class Generated[UrlBuilder]

BuildTest_UrlEncoding {

    @Test
    public void [UrlBuilder]BuildTest_UrlEncoding() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://example.com/path?query=abc&def#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String expectedUrl = "http://example.com/path?query%3Dabc%26def%23fragment";
        assertEquals(expectedUrl, urlBuilder.u.toString());
    }

}