package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;

public class GeneratedTestWithFragment {

    public String generateURL(String scheme, String netloc, String path) {
        URI uri = new URI(scheme + "://" + netloc);
        return uri.toString();
    }

    @Test
    public void testWithFragment() {
        System.out.println(generateURL("http", "www.example.com", "/path/to/resource#fragment"));
    }

    public String generateQueryString(String key, String value) {
        return key + "=" + value;
    }
}

}