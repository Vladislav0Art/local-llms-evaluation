package org.jsoup.helper;

public class GeneratedBuildUrl_CorrectScenario {

    @Test
    public void buildUrl_CorrectScenario() {
        String inputUrl = "https://example.com/path?a=1&b=2";
        URL expectedUrl = new URI("https://example.com/path").toURL();
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL actualUrl = urlBuilder.build();
        assertEquals(expectedUrl, actualUrl);
    }

}