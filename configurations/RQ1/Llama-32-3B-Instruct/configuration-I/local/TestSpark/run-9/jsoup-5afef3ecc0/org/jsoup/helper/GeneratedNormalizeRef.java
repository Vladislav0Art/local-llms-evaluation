package org.jsoup.helper;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalizeRef {

    private URI url;

    public UrlBuilder(String url) throws MalformedURLException {
        this.url = new URI(url);
    }

    public URL build() throws MalformedURLException {
        return new URL(this.url);
    }
}

class GeneratedTest {

    @Test
    public void normalizeRef() {
        String ref = " 123 ";
        assertEquals(" 123 ", UrlBuilder.normalizeRef(ref));
    }
}

class URL extends java.net.URL {
    private URI uri;

    public URL(URI uri) throws MalformedURLException {
        super(uri);
    }

    public String toString() {
        return uri.toString();
    }

}