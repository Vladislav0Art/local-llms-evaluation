package org.jsoup.helper;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendKeyVal_WithParameters_BuildsCorrectly {

    @Test
    public void appendKeyVal_WithParameters_BuildsCorrectly() throws UnsupportedEncodingException {
        Map<String, String> param = new HashMap<>();
        param.put("key", "value");

        // Create a string representing key-value pair with parameters
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : param.entrySet()) {
            sb.append(entry.getKey()).append("=").append(URLEncoder.encode(entry.getValue(), "UTF-8")).append("&");
        }
        String encodedKey = sb.toString().trimEnd();

        // Create a new UrlBuilder instance
        UrlBuilder builder = new UrlBuilder(null);

        // Append key-value pair with parameters to the UrlBuilder
        builder.appendKeyVal(encodedKey);

        // Build the URL from the UrlBuilder
        URI uri = new URI(builder.build());

        assertEquals(URI.create("key=value").toASCIIString(), uri.toString());
    }

}