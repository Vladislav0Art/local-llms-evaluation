package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAppendKeyValEmptyValue {

    public String build(String inputUrl) {
        try {
            URL parsedUrl = new URI(inputUrl);
            return parsedUrl.toString();
        } catch (URISyntaxException e) {
            return null;
        }
    }

    @Test
    public void testAppendKeyValEmptyValue() throws UnsupportedEncodingException {
        String url = build("https://example.com");
        assertNotNull(UrlBuilder.appendKeyVal(java.util.Map.Entry.<String, String>.of(null, null)));
    }

}