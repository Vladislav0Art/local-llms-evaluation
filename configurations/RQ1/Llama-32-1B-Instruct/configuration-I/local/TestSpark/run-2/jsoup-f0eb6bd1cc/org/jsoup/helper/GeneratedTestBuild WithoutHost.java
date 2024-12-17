package org.jsoup.helper;

public class GeneratedTestBuild WithoutHost {

    private final String inputUrl;
    private final URL result;

    @Test
    public void testBuild

    WithoutHost() {
        inputUrl = "https://example.com/path/to/resource?query=abc";
        result = UrlBuilder.build();
        assert result != null;
        // Ensure path is encoded correctly
        assert Validate.assertFail(result.toString());
    }

}