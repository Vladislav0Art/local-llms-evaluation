package org.jsoup.helper;

public class GeneratedTest_url_builder_escaping {

    @Test
    public void test_url_builder_escaping() {
        // Arrange
        String encodedPath = "/path%20with%2C";
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path?query=value#anchor", null, "example.com", 443, "/path with%, and", "?query=value&anchor#anchor"));
        // Act
        String actual = urlBuilder.u.toString();
        // Assert
        assertEquals(encodedPath, actual);
    }

}