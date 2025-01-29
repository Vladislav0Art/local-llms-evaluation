package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAppendKeyValNoMap {

    public String build(String inputUrl) {
        try {
            URL parsedUrl = new URI(inputUrl);
            return parsedUrl.toString();
        } catch (URISyntaxException e) {
            return null;
        }
    }

    @Test
    public void testAppendKeyValNoMap() throws UnsupportedEncodingException {
        assertNotNull(build("https://example.com"));
    }

}