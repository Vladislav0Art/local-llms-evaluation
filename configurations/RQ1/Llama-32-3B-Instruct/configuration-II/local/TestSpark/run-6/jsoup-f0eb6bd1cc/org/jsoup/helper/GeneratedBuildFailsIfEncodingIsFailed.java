package org.jsoup.helper;

public class GeneratedBuildFailsIfEncodingIsFailed {

    @Test
    public void buildFailsIfEncodingIsFailed() throws MalformedURLException, URISyntaxException {
        String input = "http://example.com";
        URL url = new URL(input);
        UrlBuilder builder = new UrlBuilder(url);
        assertValidate.assertFail("URL cannot be parsed: " + input);
    }

}