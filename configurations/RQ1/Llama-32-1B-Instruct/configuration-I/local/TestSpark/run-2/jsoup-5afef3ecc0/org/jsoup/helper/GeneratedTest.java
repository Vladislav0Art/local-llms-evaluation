package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testUrlBuilder() {
        // Arrange
        String inputUrl = "https://example.com/path?query=string&ref=%20";
        UrlBuilder builder = new UrlBuilder(new URI(inputUrl));
        URL normalizedUrl = builder.build();

        // Act
        assert normalizedUrl.toString().startsWith("https://example.com/path");
    }

    @Test
    public void testAppendKeyVal() {
        String inputKey = "key";
        String inputValue = "value";
        UrlBuilder builder = new UrlBuilder(new URI("https://example.com/path"));
        builder.appendKeyVal(UrlHelper.KeyVal.of(inputKey, inputValue));
        URL normalizedUrl = builder.build();

        // Assert
        assert normalizedUrl.toString().startsWith("https://example.com/path?key=value");
    }

    @Test
    public void testDecodePart() {
        String inputEncoded = "path%20with%2C";
        String expectedDecoded = "path with,";

        String decodedPath = UrlBuilder.decodePart(inputEncoded);
        assert decodedPath.equals(expectedDecoded);

        String encodedString = UrlHelper.URLDecoder.encode(decodedPath, UTF_8.name());
        String expectedEncoded = "%20with%,";
        String expectedDecoded = "path%20with%,";
        assert encodedString.equals(expectedEncoded);
    }

    @Test
    public void testNormalizeQuery() {
        String inputQuery = "query=string&ref=%20";
        String expectedNormalizedQuery = "query=string&ref=%20";

        String normalizedQuery = UrlBuilder.normalizeQuery(inputQuery);
        assert normalizedQuery.equals(expectedNormalizedQuery);

        String queryEncoded = UrlHelper.URLEncoder.encode(normalizedQuery, UTF_8.name());
        String expectedEncoded = "%3Astring%26ref%3D%2F20";
        String expectedDecoded = "query=string&ref=%20";
        assert queryEncoded.equals(expectedEncoded);
    }

    @Test
    public void testNormalizeRef() {
        String inputRef = "ref=%20";
        String expectedNormalizedRef = "ref=%20";

        String normalizedRef = UrlBuilder.normalizeRef(inputRef);
        assert normalizedRef.equals(expectedNormalizedRef);

        String refEncoded = UrlHelper.URLEncoder.encode(normalizedRef, UTF_8.name());
        String expectedEncoded = "%3A%2F20";
        String expectedDecoded = "ref=%20";
        assert refEncoded.equals(expectedEncoded);
    }

}