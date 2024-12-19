package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Connection connection;

    @Mock
    private Connection.KeyVal keyVal;

    @Test
    public void newUrlBuilderFromValidUrlReturnsSameUrl() throws MalformedURLException, URISyntaxException {
        URL url = new URL("http://example.com/path?query#ref");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(url, builder.build());
    }

    @Test
    public void newUrlBuilderFromInvalidUrlReturnsSameUrlAfterMalformedValidation() throws MalformedURLException, URISyntaxException {
        URL url = new URL("invalid-url");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(url, builder.build());
    }

    @Test
    public void appendKeyValToUrlAppendsQueryValueCorrectly() throws UnsupportedEncodingException {
        String query = "key=value";
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(keyVal);
        assertEquals("key=value", normalizeQuery(builder.q.toString()));
    }

    @Test
    public void appendKeyValToUrlHandlesEmptyQueryBuilder() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(keyVal);
        assertNotNull(builder.q);
        assertEquals("&key=value", builder.q.toString());
    }

    @Test
    public void decodePartReturnsOriginalStringAfterDecoding() {
        String encoded = "http%3A%2F%2Fexample.com";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals(encoded, decoded);
    }

    @Test
    public void normalizeQueryReplacesSpacesWithPlusSigns() {
        String query = "key value";
        String normalized = UrlBuilder.normalizeQuery(query);
        assertEquals("key+value", normalized);
    }

    @Test
    public void normalizeRefReplacesSpacesWithPercent20Symbols() {
        String ref = "# reference";
        String normalized = UrlBuilder.normalizeRef(ref);
        assertEquals("#%20reference", normalized);
    }

}