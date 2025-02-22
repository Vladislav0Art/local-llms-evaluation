package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void testBuild() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("https://www.example.com/path?a=1&b=2");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals("https://www.example.com/path?a=1&b=2", outputUrl.toString());
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com/path?a=1&b=2");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new Connection.KeyVal("name", "value"));
        assertEquals("name=value", urlBuilder.q.toString());
    }

    @Test
    public void testDecodePart() {
        assertEquals("name=value", UrlBuilder.decodePart("name%3Dvalue"));
    }

    @Test
    public void testNormalizeQuery() {
        assertEquals("name=value", UrlBuilder.normalizeQuery("name = value"));
    }

    @Test
    public void testNormalizeRef() {
        assertEquals("name%20value", UrlBuilder.normalizeRef("name value"));
    }

}