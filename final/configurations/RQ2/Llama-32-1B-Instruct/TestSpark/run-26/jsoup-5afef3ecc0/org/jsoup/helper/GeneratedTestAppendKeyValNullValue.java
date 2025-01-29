package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAppendKeyValNullValue {

    public String build(String inputUrl) {
        try {
            URL parsedUrl = new URI(inputUrl);
            return new URL(parsedUrl);
        } catch (URISyntaxException e) {
            return null;
        }
    }

    @Test
    public void testAppendKeyValNullValue() throws UnsupportedEncodingException {
        String url = build("https://example.com");
        assertNull(UrlBuilder.appendKeyVal(null));
    }

}