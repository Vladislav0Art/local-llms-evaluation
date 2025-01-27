package org.jsoup.helper;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuild_WorksWithValidUrl {

    @Test
    public void build_WorksWithValidUrl() throws MalformedURLException {
        String url = "http://example.com";

        // Create a new UrlBuilder instance with valid URL
        UrlBuilder builder = new UrlBuilder(new java.net.URL(url));

        // Build the URL from the UrlBuilder
        URI uri = new URI(builder.build());

        assertEquals(URI.create("http://example.com").toASCIIString(), uri.toString());
    }

}

public class UrlBuilder {

    private String url;

    public UrlBuilder() {
    }

    public UrlBuilder(String url) {
        this.url = url;
    }

    public void appendKeyVal(String encodedKey) {
        if (encodedKey != null && !encodedKey.isEmpty()) {
            // Check that you actually want to add the query parameter
            this.url += "?" + encodedKey;
        }
    }

    public String build() {
        return url;
    }

}