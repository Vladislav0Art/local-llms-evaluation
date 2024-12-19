package org.jsoup.helper;

public class GeneratedTestUrlBuilder_WithNullInput {

    @Test
    public void testUrlBuilder_WithNullInput() {
        // Arrange
        String inputUrl = null;

        // Act and Assert
        try {
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            urlBuilder.build();
            fail("Expected exception not thrown");
        } catch (MalformedURLException e) {
            assert (true);
        }
    }

}