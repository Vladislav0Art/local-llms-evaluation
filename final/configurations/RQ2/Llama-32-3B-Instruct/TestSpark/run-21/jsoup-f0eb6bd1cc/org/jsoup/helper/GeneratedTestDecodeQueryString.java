package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class GeneratedTestDecodeQueryString {

    @Test
    public void testDecodeQueryString() {
        UrlBuilder builder = new UrlBuilder();
        String decodedQuery = builder.decodeQueryString("key=value&other=value%20with%20spaces");
        assertEquals("key=value&other=value with spaces", decodedQuery);
    }
}

class UrlBuilder {
    public URL build(String url) {
        return new URL(url);
    }

    public String decodeQueryString(String query) {
        String[] parts = Base64.getDecoder().decode(query).toString().split("-");
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].length() % 4 != 0 && parts[i].length() != 0) {
                parts[i] += "=";
            }
        }
        return new String(parts, 0, parts.length - (parts.length % 4), StandardCharsets.UTF_8);
    }

}