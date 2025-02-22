package org.jsoup.helper;

public class GeneratedBuild_WithValidInput_ExpectValidOutput {

    private UrlBuilder builder;

    @Before
    public void setup() {
        builder = new UrlBuilder(new URL("http://example.com/"));
    }

    @Test
    public void build_WithValidInput_ExpectValidOutput() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
        assertEquals("http://example.com/", builtUrl.toString());
    }

}