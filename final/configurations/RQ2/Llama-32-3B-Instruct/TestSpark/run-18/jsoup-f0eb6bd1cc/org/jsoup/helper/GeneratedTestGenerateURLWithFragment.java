package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;

public class GeneratedTestGenerateURLWithFragment {

    public String generateURL(String scheme, String netloc, String path) {
        URI uri = new URI(scheme + "://" + netloc);
        return uri.toString();
    }

    @Test
    public void testGenerateURLWithFragment() {
        System.out.println(urlGenerator.generateURL("http", "www.example.com", "/path/to/resource#fragment"));
    }

}