package org.jsoup.helper;

public class GeneratedTestBuild_WithEncodedQuery {

    private final String inputUrl;
    private final URL result;

    @Test
    public void testBuild_WithEncodedQuery() {
        inputUrl = "https://example.com/path/to/resource?query=abc#fragment";
        result = UrlBuilder.build();
        assert result != null;
        // Ensure path is encoded correctly
        assert Validate.assertFail(result.toString());
    }

}