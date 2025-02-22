package org.jsoup.helper;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://www.example.com/path?q=s");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL outputUrl = urlBuilder.build();

        assertEquals(outputUrl.getProtocol(), "http");
        assertEquals(outputUrl.getHost(), "www.example.com");
        assertEquals(outputUrl.getPath(), "/path");
        assertEquals(outputUrl.getQuery(), "q=s");
    }

}