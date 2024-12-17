package org.jsoup.helper;

public class GeneratedTest_url_builder_append_key_val {

    @Test
    public void test_url_builder_append_key_val() {
        // Arrange
        String key = "key";
        String value = "value";
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path?query=value#anchor"));
        String expected = "key=value&anchor#anchor";
        urlBuilder.appendKeyVal(UrlBuilder.KeyVal.of(key, value));
        // Act
        String actual = urlBuilder.u.toString();
        // Assert
        assertEquals(expected, actual);
    }

}