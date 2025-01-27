package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;

public class GeneratedTestBasicURL {

    public String generateURL(String scheme, String netloc, String path) {
        URI uri = new URI(scheme + "://" + netloc);
        return uri.toString();
    }

    @Test
    public void testBasicURL() {
        System.out.println(generateURL("http", "www.example.com", "/path/to/resource"));
    }

}