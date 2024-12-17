package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Map;

public class GeneratedBuild_url_withQueryAndRef_correctlyEncoded {

    @Test
    public void build_url_withQueryAndRef_correctlyEncoded() {
        URL inputUrl = new URL("https://example.com/path?a=1&b=2#ref");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        String expected = "https%3A//example.com/path%3Fa%3D1%26b%3D2%23ref";
        assertEquals(expected, builder.u.toURI().toASCIIString());
    }

}