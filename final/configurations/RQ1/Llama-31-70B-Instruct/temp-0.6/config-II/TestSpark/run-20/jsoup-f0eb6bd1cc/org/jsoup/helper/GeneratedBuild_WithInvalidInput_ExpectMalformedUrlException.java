package org.jsoup.helper;

public class GeneratedBuild_WithInvalidInput_ExpectMalformedUrlException {

    private UrlBuilder builder;

    @Before
    public void setup() {
        builder = new UrlBuilder(new URL("http://example.com/"));
    }

    @Test
    public void build_WithInvalidInput_ExpectMalformedUrlException() throws MalformedURLException {
        URL inputUrl = new URL("invalid");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build();
    }

}