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

public class GeneratedNormalizeQueryTest {

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