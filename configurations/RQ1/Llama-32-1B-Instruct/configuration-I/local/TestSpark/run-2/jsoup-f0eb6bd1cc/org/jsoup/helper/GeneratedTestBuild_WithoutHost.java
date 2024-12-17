package org.jsoup.helper;

public class GeneratedTestBuild_WithoutHost {

    @Test
    public void testBuild_WithoutHost() {
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