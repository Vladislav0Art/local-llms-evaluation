package org.jsoup.helper;

public class GeneratedTestBuildWithUnsupportedEncoding {

    @Test
    public void testBuildWithUnsupportedEncoding() {
        // Arrange
        String inputUrl = "https://example.com/path";

        // Act and Assert
        try {
            UrlBuilder.urlBuilder(inputUrl);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}