package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;

public class GeneratedTest {

    public String generateURL(String scheme, String netloc, String path) {
        URI uri = new URI(scheme + "://" + netloc);
        return uri.toString();
    }

    @Test
    public void testBasicURL() {
        System.out.println(generateURL("http", "www.example.com", "/path/to/resource"));
    }

    @Test
    public void testWithQueryParams() {
        System.out.println(generateURL("http", "www.example.com", "/path/to/resource?key=value&foo=bar"));
    }

    @Test
    public void testWithFragment() {
        System.out.println(generateURL("http", "www.example.com", "/path/to/resource#fragment"));
    }

    public String generateQueryString(String key, String value) {
        return key + "=" + value;
    }
}

@Test
public void testGenerateURL() {
    System.out.println(urlGenerator.generateURL("http", "www.example.com", "/path/to/resource"));
}

@Test
public void testGenerateURLWithQueryParams() {
    System.out.println(urlGenerator.generateURL("http", "www.example.com", "/path/to/resource?key=value&foo=bar"));
}

@Test
public void testGenerateURLWithFragment() {
    System.out.println(urlGenerator.generateURL("http", "www.example.com", "/path/to/resource#fragment"));
}

@Test
public void testGenerateQueryString() {
    System.out.println(urlGenerator.generateQueryString("key", "value"));
    System.out.println(urlGenerator.generateQueryString("foo", "bar"));
}

}