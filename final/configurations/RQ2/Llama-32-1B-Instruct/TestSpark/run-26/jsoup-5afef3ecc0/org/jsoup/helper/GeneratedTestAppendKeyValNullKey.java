package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAppendKeyValNullKey {

    public String build(String inputUrl) {
        try {
            URL parsedUrl = new URI(inputUrl);
            return parsedUrl.toString();
        } catch (URISyntaxException e) {
            return null;
        }
    }

    @Test
    public void testAppendKeyValNullKey() throws UnsupportedEncodingException {
        assertEquals("", UrlBuilder.build(build("https://example.com")));
    }

}