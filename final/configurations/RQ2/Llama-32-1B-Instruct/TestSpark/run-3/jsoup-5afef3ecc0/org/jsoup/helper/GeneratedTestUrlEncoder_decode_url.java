package org.jsoup.helper;

public class GeneratedTestUrlEncoder_decode_url {

    @Test
    public void testUrlEncoder_decode_url() throws UnsupportedEncodingException {
        String encodedUrl = "https%3A//example.com";
        URL url = UrlBuilder.decodeURL(encodedUrl);
        assertEquals(new URI("https://example.com"), url);
    }

}