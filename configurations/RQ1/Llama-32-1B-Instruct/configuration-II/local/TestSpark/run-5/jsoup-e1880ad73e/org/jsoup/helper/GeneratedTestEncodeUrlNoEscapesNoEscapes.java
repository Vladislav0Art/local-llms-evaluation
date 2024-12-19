package org.jsoup.helper;

public class GeneratedTestEncodeUrlNoEscapesNoEscapes {

    private static String encodeUrl(String input, URLBuilder Builder) {
        try {
            URI uri = new URI(input);
            return Builder.build().toASCIIString();
        } catch (URISyntaxException e) {
            throw Validate.assertFail(e.toString());
        }
    }

    @Test
    public void testEncodeUrlNoEscapesNoEscapes() {
        UrlBuilder builder = new UrlBuilder("https://example.com/path?query=abc#anchor");
        String encodedUrl = encodeUrl(builder.u.toString(), builder);
        assertEquals("https%3A%2F%2Fexample%2Fcom%2Fpath%3Fquery%3Dabc%23anchor", encodedUrl);
    }

}