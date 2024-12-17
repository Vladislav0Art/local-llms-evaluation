package org.jsoup.helper;

public class GeneratedTest_url_builder_non_ascii {

    @Test
    public void test_url_builder_non_ascii() {
        // Arrange
        String encodedPath = "/path\\u202cwith\\u3000,";
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path?query=value#anchor", null, "example.com", 443, "/path with%2C", "?query=value&anchor#anchor"));
        // Act
        String actual = urlBuilder.u.toString();
        // Assert
        assertEquals(encodedPath, actual);
    }

}