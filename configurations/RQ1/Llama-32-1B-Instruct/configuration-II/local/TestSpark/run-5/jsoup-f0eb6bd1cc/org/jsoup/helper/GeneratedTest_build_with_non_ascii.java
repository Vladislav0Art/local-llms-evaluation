package org.jsoup.helper;

public class GeneratedTest_build_with_non_ascii {

    private static final String BASE_URL = "https://example.com/path?a=1&b=2#fragment";

    @Test
    public void test_build_with_non_ascii() throws MalformedURLException, URISyntaxException {
        URL baseUrl = new URI(BASE_URL).getScheme() + "://" +
                new URI("http", null, null).getUserInfo() + ":" +
                new URI("http", null, null).getIdN().toASCII();
        String expectedBuild = new URI(
                "http",
                "user",
                "admin",
                "/path?a=1&b=2#fragment"
        ).getScheme() + "://" +
                new URI("http", null, null).getUserInfo() + ":" +
                new URI("http", null, null).getIdN().toASCII();
        UrlBuilder urlBuilder = new UrlBuilder(baseUrl);
        String actualBuild = urlBuilder.build();
        assertEquals(expectedBuild, actualBuild);
    }

}