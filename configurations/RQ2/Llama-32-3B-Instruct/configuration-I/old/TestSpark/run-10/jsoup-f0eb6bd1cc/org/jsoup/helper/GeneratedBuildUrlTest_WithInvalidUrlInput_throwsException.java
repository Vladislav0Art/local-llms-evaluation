package org.jsoup.helper;

public class GeneratedBuildUrlTest_WithInvalidUrlInput_throwsException {

    @Test
    public void buildUrlTest_WithInvalidUrlInput_throwsException() {
        try {
            String invalidUrl = "invalid://url";
            UrlBuilder urlBuilder = new UrlBuilder(new URL(invalidUrl));
            urlBuilder.build();
            fail("Expected exception not thrown");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

}