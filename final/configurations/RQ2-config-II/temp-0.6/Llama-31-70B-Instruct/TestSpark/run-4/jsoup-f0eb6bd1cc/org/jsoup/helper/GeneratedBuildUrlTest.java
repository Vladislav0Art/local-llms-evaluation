package org.jsoup.helper;

public class GeneratedBuildUrlTest {

    private UrlBuilder urlBuilder;

    @Test
    public void buildUrlTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com/");
        urlBuilder = new UrlBuilder(inputUrl);
        URL actualUrl = urlBuilder.build();
        assertEquals(inputUrl, actualUrl);
    }

}