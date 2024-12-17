package org.jsoup.helper;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

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
    public void buildNormalUrlTest() throws MalformedURLException, URISyntaxException {
        String url = "http://example.com/path?a=1&b=2";
        UrlBuilder builder = new UrlBuilder(url);
        URL outputUrl = builder.build();
        assertEquals("http://example.com/path", outputUrl.toURI().toString());
    }

    @Test
    public void decodePart() {
        String encoded = "Hello%20World";
        assertEquals("Hello World", UrlBuilder.decodePart(encoded));
    }

    @Test
    public void normalizeQuery() {
        String query = "a=1&b=2";
        assertEquals("", UrlBuilder.normalizeQuery(query));
    }

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