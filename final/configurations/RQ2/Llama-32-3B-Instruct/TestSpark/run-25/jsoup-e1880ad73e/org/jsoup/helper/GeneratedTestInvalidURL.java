package org.jsoup.helper;

public class GeneratedTestInvalidURL {

    @Test
    public void testInvalidURL() {
        String invalidURL = "invalid://example.com/path?param=value";
        try {
            new URL(invalidURL);
            assert false : "Expected exception not thrown";
        } catch (MalformedURLException e) {
            // expected
        }
    }
}

}