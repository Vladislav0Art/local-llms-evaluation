package org.jsoup.helper;

public class Generated[UrlBuilder]

BuildTest_PunyCoding {

    @Test
    public void [UrlBuilder]BuildTest_PunyCoding() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://example.com/áth");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("http://example.com/%C3%A1th");
        assertEquals(expectedUrl, urlBuilder.u);
    }

}