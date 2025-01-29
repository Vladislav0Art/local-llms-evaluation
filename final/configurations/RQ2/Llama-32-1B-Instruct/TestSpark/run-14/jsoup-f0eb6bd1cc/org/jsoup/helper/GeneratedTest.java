package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class GeneratedTest {

    public String build() {
        return "http://example.com";
    }

    @Test
    public void appendKeyVal_SimpleTest() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        assertEquals("", urlBuilder.appendKeyVal(Arrays.asList(new String[][]{{"key", "value"}})));
        assertEquals(null, urlBuilder.appendKeyVal(Arrays.asList(new String[][]{{"non-existent-key", "value"}})));
    }

    @Test
    public void appendKeyVal_InvalidKeysTest() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        assertEquals("", urlBuilder.appendKeyVal(Arrays.asList(new String[][]{{"key", "value"}})));
        assertEquals(null, urlBuilder.appendKeyVal(Arrays.asList(new String[][]{{"non-existent-key"}})));
    }

    @Test
    public void build_SimpleTest() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        assertNotNull(urlBuilder.build());
        assertTrue(urlBuilder.build().getProtocol().equals("http"));
        assertTrue(urlBuilder.build().getHost().equals("example.com"));
    }

    @Test
    public void appendKeyVal_FailedEncodingTest() {
        try {
            build();
            fail("Expected URISyntaxException");
        } catch (URISyntaxException e) {
            // expected
        }
    }

    @Test
    public void appendKeyVal_SplitValuesTest() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        String[] kv = {"k=v", "x=y"};
        assertEquals(Arrays.asList(kv), urlBuilder.appendKeyVal(Arrays.asList(kv)));
    }

    @Test
    public void appendKeyVal_MultipleValuesTest() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        String[] kv = {"key1=value1&key2=value2", "key3=value3"};
        assertEquals(Arrays.asList(kv), urlBuilder.appendKeyVal(Arrays.asList(kv)));
    }

    @Test
    public void appendKeyVal_DelimeterNotCorrectlyParsedTest() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        String[] kv = {"key1=value1", "key2=value2"};
        assertEquals(Arrays.asList(kv), urlBuilder.appendKeyVal(Arrays.asList(kv)));
    }

    @Test
    public void appendKeyVal_DelimeterAndValueAreEqualButNotTheSame() {
        UrlBuilder urlBuilder = new UrlBuilder("http://example.com");
        String[] kv = {"key1=value1", "key2=value2"};
        assertEquals(Arrays.asList(kv), urlBuilder.appendKeyVal(Arrays.asList(kv)));
    }

}