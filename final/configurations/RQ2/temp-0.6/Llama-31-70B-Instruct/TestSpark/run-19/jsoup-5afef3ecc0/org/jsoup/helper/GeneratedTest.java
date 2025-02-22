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

public class GeneratedTest {

    @Test
    public void buildUrlTest() throws URISyntaxException, MalformedURLException {
        // create a test URL
        URL testUrl = new URL("https://example.com/path?query=value");
        // create a UrlBuilder instance
        UrlBuilder builder = new UrlBuilder(testUrl);
        // build the URL
        URL normalizedUrl = builder.build();
        // assert that the URL is normalized as expected
        assertEquals("https://example.com/path?query=value", normalizedUrl.toString());
    }

    @Test
    public void decodePartTest() {
        // test a encoded URL part
        String encodedPart = "a%20b%20c";
        // decode the part
        String decodedPart = decodePart(encodedPart);
        // assert that the part is decoded as expected
        assertEquals("a b c", decodedPart);
    }

    @Test
    public void normalizeQueryTest() {
        // test a query string with spaces
        String query = "a b c";
        // normalize the query
        String normalizedQuery = normalizeQuery(query);
        // assert that the query is normalized as expected
        assertEquals("a+b+c", normalizedQuery);
    }

}