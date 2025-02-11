package org.jsoup.helper;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNormalizeRefTest {

    public String decodePart(String encoded) {
        return IDN.decode(encoded);
    }

    public String normalizeQuery(String q) {
        // implement normalization logic here
        return q; // or you can use a library to do it for you
    }

    public String normalizeRef(String r) {
        // implement normalization logic here
        return r; // or you can use a library to do it for you
    }

    @Test
    public void normalizeRefTest() {
        String r = " example.com";
        assertEquals(" example.com", normalizeRef(r));
    }
}

public class UrlBuilder {

    private URL u;

    public UrlBuilder(URL u) {
        this.u = u;
    }

    public static class ConnectionKeyVal {
        // implement connection key val logic here
    }

    public void decodePart(String encoded) {
        // implement decoding logic here
    }

    public String normalizeQuery(String q) {
        // implement normalization logic here
        return q; // or you can use a library to do it for you
    }

    public String normalizeRef(String r) {
        // implement normalization logic here
        return r; // or you can use a library to do it for you
    }

}