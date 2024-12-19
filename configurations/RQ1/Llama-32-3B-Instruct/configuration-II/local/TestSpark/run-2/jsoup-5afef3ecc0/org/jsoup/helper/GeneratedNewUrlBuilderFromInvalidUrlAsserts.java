package org.jsoup.helper;

public class GeneratedNewUrlBuilderFromInvalidUrlAsserts {

    @Test
    public void newUrlBuilderFromInvalidUrlAsserts() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("invalid_url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assert Validate.assertFail("MalformedURLException: 'invalid_url' is not a valid URL");
    }

}