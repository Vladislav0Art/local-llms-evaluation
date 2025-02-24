package org.jsoup.helper;

public class GeneratedBuildTest {

    private UrlBuilder urlBuilder;

    @Test
    public void buildTest() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("https://www.example.com");
        urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals(new URI("https://www.example.com"), outputUrl.toURI());
    }

}