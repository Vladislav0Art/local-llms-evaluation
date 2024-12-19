package org.jsoup.helper;

public class GeneratedTest_build {

    private static final String BASE_URL = "https://example.com/path?a=1&b=2#fragment";

    @Test
    public void test_build() throws MalformedURLException, URISyntaxException {
        URL baseUrl = new URI(BASE_URL);
        String expectedBuild = new URI("https://example.com/path?a=1&b=2").getScheme() + "://" +
                new URI("http", null, null).getUserInfo() + ":" +
                new URI("http", null, null).getIdN().toASCII();
        UrlBuilder urlBuilder = new UrlBuilder(baseUrl);
        String actualBuild = urlBuilder.build();
        assertEquals(expectedBuild, actualBuild);
    }

}