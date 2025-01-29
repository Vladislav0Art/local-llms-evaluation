package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;

import static org.junit.Assert.*;

public class GeneratedTest {

    private String inputUrl = "https://example.com/path?a=1&b=2";

    @Before
    public void setup() {
        // Add any necessary setup here
    }

    @Test
    public void testBuildWithoutAppendKeyVal() throws IOException, URISyntaxException, MalformedURLException {
        URLBuilder urlBuilder = new UrlBuilder(new URI(inputUrl));
        String result = urlBuilder.build();
        assertEquals("https://example.com/path?a=1&b=2", result);
    }

    @Test
    public void testBuildWithAppendKeyVal() throws IOException, URISyntaxException, MalformedURLException {
        URLBuilder urlBuilder = new UrlBuilder(new URI(inputUrl));
        urlBuilder.appendKeyVal(new org.jsoup.helper.KeyVal("c", "3"));
        String result = urlBuilder.build();
        assertEquals("https://example.com/path?a=1&b=2&c=3", result);
    }

    @Test
    public void testAppendKeyVal_SingleValue() throws IOException, URISyntaxException, MalformedURLException {
        URLBuilder urlBuilder = new UrlBuilder(new URI(inputUrl));
        urlBuilder.appendKeyVal(new org.jsoup.helper.KeyVal("d", "4"));
        String result = urlBuilder.build();
        assertEquals("https://example.com/path?a=1&b=2&c=3&d=4", result);
    }

    @Test
    public void testAppendKeyVal_MultipleValues() throws IOException, URISyntaxException, MalformedURLException {
        URLBuilder urlBuilder = new UrlBuilder(new URI(inputUrl));
        urlBuilder.appendKeyVal(new org.jsoup.helper.KeyVal("e", "5"));
        String result = urlBuilder.build();
        assertEquals("https://example.com/path?a=1&b=2&c=3&e=5", result);
    }

    @Test
    public void testAppendKeyVal_UnsupportedEncoding() throws IOException, URISyntaxException, MalformedURLException {
        URLBuilder urlBuilder = new UrlBuilder(new URI(inputUrl));
        String[] kv = {"f", "6"};
        try {
            urlBuilder.appendKeyVal(kv);
            FAIL();
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void testBuildWithoutAppendKeyVal_InvalidURL() throws IOException, URISyntaxException, MalformedURLException {
        URLBuilder urlBuilder = new UrlBuilder(new URI("invalid url"));
        String result = urlBuilder.build();
        assertEquals("", result);
    }

}