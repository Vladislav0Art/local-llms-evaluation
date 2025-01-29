package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendKeyVal_7 {

    @Test
    public void testAppendKeyVal_7() {
        URL decodedUrl = decodeUrl(new HttpUrl("https://example.com/path?param=value").toString());
        Map<String, String> kv = new HashMap<>();
        kv.put("key", "value");
        UrlBuilder builder = new UrlBuilder(decodedUrl);
        assertEquals("https://example.com/path?key=value&param=value", decodedUrl.toString());
    }

    private String decodeUrl(String url) {
        try {
            return new URI(url).getScheme() + "://" + new URI(url).getAuthority() + "/" + new URI(url).getPath();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

}