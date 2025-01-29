package org.jsoup.helper;

public class GeneratedTestBuild_SingleArgument_ThrowsException {

    private String inputUrl = "https://example.com";

    @Test
    public void testBuild_SingleArgument_ThrowsException() throws UnsupportedEncodingException {
        String singleArgInputUrl = "https://example.com";
        try {
            urlBuilder.build(singleArgInputUrl);
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
            // Expected
        }
    }

}