package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

public class Generated[UrlBuilderDecodePart]

decode {

    @Test
    public void [UrlBuilderDecodePart]decode() throws UnsupportedEncodingException {
        String encoded = "http%3A//example.com/path";
        String decoded = UrlBuilder.decodePart(encoded);

        assertTrue(decoded.equals("http://example.com/path"));
    }

}