package org.jsoup.helper;

public class GeneratedTest_url_builder_init {

    @Test
    public void test_url_builder_init() {
        // Arrange
        String url = "https://example.com/path?query=value#anchor";
        URLBuilder urlBuilder = new UrlBuilder(new URI("https", null, "example.com", 443, "/path", "?query=value", "#anchor"));
        // Act
        urlBuilder.build();
        // Assert
        assertEquals(url, urlBuilder.u.toString());
    }

}