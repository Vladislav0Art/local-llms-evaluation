package org.jsoup.helper;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.UrlBuilder.build;
import static org.jsoup.helper.UrlBuilder.decodePart;
import static org.jsoup.helper.UrlBuilder.normalizeQuery;
import static org.jsoup.helper.UrlBuilder.normalizeRef;
import static org.junit.Assert.assertEquals;

public class GeneratedDecodePartTest {

    @Test
    public void decodePartTest() {
        // test a encoded URL part
        String encodedPart = "a%20b%20c";
        // decode the part
        String decodedPart = decodePart(encodedPart);
        // assert that the part is decoded as expected
        assertEquals("a b c", decodedPart);
    }

}