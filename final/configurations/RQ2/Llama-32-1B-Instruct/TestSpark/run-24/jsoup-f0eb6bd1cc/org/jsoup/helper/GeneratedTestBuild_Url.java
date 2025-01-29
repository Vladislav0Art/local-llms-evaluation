package org.jsoup.helper;

public class GeneratedTestBuild_Url {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        // TO DO: add necessary setup for test cases
    }

    @Test
    public void testBuild_Url() throws UnsupportedEncodingException {
        String inputUrl = "http://example.com/path?query=param";
        URL expectedUrl = new URI("http://example.com/path?query=param").toString();
        urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(expectedUrl, urlBuilder.build());
    }

}