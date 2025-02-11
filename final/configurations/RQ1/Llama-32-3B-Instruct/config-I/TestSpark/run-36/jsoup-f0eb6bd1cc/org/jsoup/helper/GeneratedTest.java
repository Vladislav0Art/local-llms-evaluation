package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;

public class GeneratedTest {

    @Test
    public void createUrlBuilder_withNullUrl_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

    @Test
    public void createUrlBuilder_withoutQueryBuildsUrlWithoutQuery() {
        URL url = new URL("https://example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("https://example.com/path", urlBuilder.build().toString());
    }

    @Test
    public void createUrlBuilder_withNullQueryBuildsUrlWithEmptyQueryString() {
        URL url = new URL("https://example.com/path?query=string");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("https://example.com/path", urlBuilder.build().toString());
    }

    @Test
    public void createUrlBuilder_buildsUrlWithoutFragmentWhenNoFragmentIsPresent() {
        URL url = new URL("https://example.com/path?query=string#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("https://example.com/path?query=string", urlBuilder.build().toString());
    }

    @Test
    public void appendKeyVal_appendsKeyValuePairs() {
        Connection.KeyVal keyVal = new Connection.KeyVal();
        keyVal.key("key");
        keyVal.value("value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path"));
        urlBuilder.appendKeyVal(keyVal);
        assertEquals("?key=value", urlBuilder.build().getQuery());
    }

    @Test
    public void appendToAscii_appendsEncodedPathWhenNonASCIICharactersArePresent() {
        String path = "path with non-ascii characters";
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii(path, false, sb);
        assertEquals("%C3%A5path with non-ascii characters", sb.toString());
    }

    @Test
    public void appendToAscii_leavesASCIICharactersAsIs() {
        String path = "path with only ascii characters";
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii(path, false, sb);
        assertEquals("path with only ascii characters", sb.toString());
    }

}