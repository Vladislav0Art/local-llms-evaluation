package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;

public class GeneratedTestGenerateQueryString {

    public String generateURL(String scheme, String netloc, String path) {
        URI uri = new URI(scheme + "://" + netloc);
        return uri.toString();
    }

    @Test
    public void testGenerateQueryString() {
        System.out.println(urlGenerator.generateQueryString("key", "value"));
        System.out.println(urlGenerator.generateQueryString("foo", "bar"));
    }

}