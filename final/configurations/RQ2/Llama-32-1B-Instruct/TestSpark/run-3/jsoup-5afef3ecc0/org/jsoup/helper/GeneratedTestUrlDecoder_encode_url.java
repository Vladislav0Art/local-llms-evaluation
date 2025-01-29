package org.jsoup.helper;

public class GeneratedTestUrlDecoder_encode_url {

    @Test
    public void testUrlDecoder_encode_url() throws UnsupportedEncodingException {
        URL url = new URI("https://example.com");
        String encodedUrl = UrlBuilder.encodeURL(url);
        assertEquals("https%3A//example.com", encodedUrl.toString());
    }

}