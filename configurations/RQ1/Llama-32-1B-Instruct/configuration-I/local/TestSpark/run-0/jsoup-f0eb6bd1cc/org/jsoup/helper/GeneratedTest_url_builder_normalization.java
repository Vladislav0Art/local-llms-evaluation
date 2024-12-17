package org.jsoup.helper;

public class GeneratedTest_url_builder_normalization {

    @Test
    public void test_url_builder_normalization() {
        // Arrange
        String url = "https://example.com/path?query=value#anchor";
        URLBuilder urlBuilder = new UrlBuilder(new URI("https", null, "example.com", 443, "/path", "?query=value", "#anchor"));
        // Act
        String expected = "https%3A//example.com%2Fpath%3A%2Fvalue%23anchor";
        urlBuilder.build();
        // Assert
        assertEquals(expected, url);
    }

}