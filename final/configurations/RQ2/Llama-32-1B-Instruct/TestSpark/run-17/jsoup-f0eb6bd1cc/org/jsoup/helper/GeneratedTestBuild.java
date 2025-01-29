package org.jsoup.helper;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        // Arrange
        String inputUrl = "https://example.com/path";
        URL url = build(inputUrl);

        // Act and Assert
        assertEquals(inputUrl, url.toString());
    }

}