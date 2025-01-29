package org.jsoup.helper;

public class GeneratedTestBuild_UnsupportedEncoding {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        // TO DO: add necessary setup for test cases
    }

    @Test
    public void testBuild_UnsupportedEncoding() throws UnsupportedEncodingException {
        String inputUrl = "http://example.com/path?query=param";
        try {
            urlBuilder.build();
            fail("Expected UnauthorizedException");
        } catch (UnauthorizedException e) {
            // TO DO: verify that the exception is thrown with the correct error message
        }
    }

}