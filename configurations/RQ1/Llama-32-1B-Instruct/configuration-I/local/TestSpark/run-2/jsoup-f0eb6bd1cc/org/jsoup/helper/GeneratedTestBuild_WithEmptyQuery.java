package org.jsoup.helper;

public class GeneratedTestBuild_WithEmptyQuery {

    private final String inputUrl;
    private final URL result;

    @Test
    public void testBuild_WithEmptyQuery() {
        inputUrl = "https://example.com";
        result = UrlBuilder.build();
        assert result != null;
        assert !Validate.assertFail(result.toString());
    }

}