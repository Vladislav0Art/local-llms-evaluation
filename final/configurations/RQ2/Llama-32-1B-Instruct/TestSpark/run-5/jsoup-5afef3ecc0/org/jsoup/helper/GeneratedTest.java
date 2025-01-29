package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.Locale;

public class GeneratedTest {

    @Test
    public void testBuild() {
        String inputUrl = "https://example.com/path?param1=value1&param2=value2";
        URL result = new UrlBuilder(inputUrl).build();
        assertEquals("https://example.com/path?param1=value1&param2=value2", result.toURI().toString());
    }

    @Test
    public void testAppendKeyVal() {
        String inputString = "key1=value1, key2=value2";
        String[] kvPairs = inputString.split(",");
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        for (String kv : kvPairs) {
            assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(kv));
        }
    }

    @Test
    public void testAppendKeyValEmpty() {
        String inputString = "";
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assertEquals("", urlBuilder.appendKeyVal(""));
    }

    @Test
    public void testAppendKeyValNull() {
        String inputString = null;
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(null));
    }

    @Test
    public void testAppendKeyValMalformed() throws MalformedURLException {
        String inputString = "key1=value1&";
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assertThrows(MalformedURLException.class, () -> urlBuilder.appendKeyVal(inputString));
    }

    @Test
    public void testAppendKeyValURLEncoded() {
        String inputString = "key1=value1&param2=value2";
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assertEquals("https%3A%2F%2Fexample.com/path%3Fparam1%3Dvalue1%26param2%3Dvalue2", urlBuilder.appendKeyVal(inputString));
    }

    @Test
    public void testAppendKeyValURLEncodedNull() {
        String inputString = "key1=value1&param2= value2";
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assertThrows(NullPointerException.class, () -> urlBuilder.appendKeyVal(null));
    }

    @Test
    public void testAppendKeyValURLEncodedEmpty() {
        String inputString = "key1=value1&";
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assertEquals("", urlBuilder.appendKeyVal(inputString));
    }

}