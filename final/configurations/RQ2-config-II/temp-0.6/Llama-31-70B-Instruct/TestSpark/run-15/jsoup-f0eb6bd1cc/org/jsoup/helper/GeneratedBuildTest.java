package org.jsoup.helper;

public class GeneratedBuildTest {

    private static final String TEST_URL = "http://www.example.com/test";

    @Test
    public void buildTest() throws MalformedURLException {
        URL expectedUrl = new URL(TEST_URL);
        UrlBuilder urlBuilder = new UrlBuilder(expectedUrl);
        URL actualUrl = urlBuilder.build();
        assertEquals(expectedUrl, actualUrl);
    }

}