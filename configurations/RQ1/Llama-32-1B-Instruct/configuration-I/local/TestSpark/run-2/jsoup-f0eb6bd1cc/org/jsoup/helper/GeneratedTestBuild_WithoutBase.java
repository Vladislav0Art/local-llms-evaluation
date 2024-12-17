package org.jsoup.helper;

public class GeneratedTestBuild_WithoutBase {

    @Test
    public void testBuild_WithoutBase() {
        String inputUrl = "https://example.com/path/to/resource?query=abc";
        UrlBuilder.url = null;
        try {
            Result result = UrlBuilder.build();
            assert result != null;
            // Ensure path is encoded correctly
            Validate.assertFail(result.toString());
        } catch (UnsupportedEncodingException e) {
            assert false;
        }
    }

}