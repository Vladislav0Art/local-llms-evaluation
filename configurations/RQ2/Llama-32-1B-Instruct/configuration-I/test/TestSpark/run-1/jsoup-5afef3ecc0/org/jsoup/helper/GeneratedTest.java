package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    @Test
    public void testBuildWithEmptyInputUrl() {
        final Document document = new Document();
        String urlString = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(urlString);
        URL actualUrl = urlBuilder.build();
        Assert.assertEquals("https://example.com", actualUrl.toString());
    }

    @Test
    public void testBuildWithInvalidKeyVal() {
        final Document document = new Document();
        String urlString = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(urlString);
        try {
            urlBuilder.appendKeyVal(null);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void testAppendKeyValue() throws Exception {
        final Document document = new Document();
        String urlString = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(urlString);
        urlBuilder.appendKeyVal("key", "value");
        URL actualUrl = urlBuilder.build();
        Assert.assertEquals("https://example.com?key=value", actualUrl.toString());
    }

    @Test
    public void testAppendMultipleKeyValue() throws Exception {
        final Document document = new Document();
        String urlString = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(urlString);
        urlBuilder.appendKeyVal("key1", "value1");
        urlBuilder.appendKeyVal("key2", "value2");
        URL actualUrl = urlBuilder.build();
        Assert.assertEquals("https://example.com?key1=value1&key2=value2", actualUrl.toString());
    }

    @Test
    public void testAppendInvalidKeyValue() throws Exception {
        final Document document = new Document();
        String urlString = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(urlString);
        try {
            urlBuilder.appendKeyVal("key", "value");
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void testAppendKeyValueWithEmptyValue() throws Exception {
        final Document document = new Document();
        String urlString = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(urlString);
        urlBuilder.appendKeyVal("key", "");
        URL actualUrl = urlBuilder.build();
        Assert.assertEquals("https://example.com?key=", actualUrl.toString());
    }

    @Test
    public void testAppendKeyValueWithNone() throws Exception {
        final Document document = new Document();
        String urlString = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(urlString);
        urlBuilder.appendKeyVal("key", null);
        URL actualUrl = urlBuilder.build();
        Assert.assertEquals("https://example.com?key=null", actualUrl.toString());
    }

    @Test
    public void testAppendKeyValueWithEmptyConnection() throws Exception {
        final Document document = new Document();
        String urlString = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(urlString);
        try {
            urlBuilder.appendKeyVal("key", "");
        } catch (UnsupportedEncodingException e) {
            Assert.fail("Expected UnsupportedOperationException");
        }
    }

    @Test
    public void testAppendKeyValueWithNullConnection() throws Exception {
        final Document document = new Document();
        String urlString = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(urlString);
        try {
            urlBuilder.appendKeyVal(null, "");
        } catch (UnsupportedEncodingException e) {
            Assert.fail("Expected UnsupportedOperationException");
        }
    }

    @Test
    public void testAppendKeyValueWithEmptyUrl() throws Exception {
        final Document document = new Document();
        String urlString = "";
        UrlBuilder urlBuilder = new UrlBuilder(urlString);
        try {
            urlBuilder.appendKeyVal("key", "");
        } catch (UnsupportedEncodingException e) {
            Assert.fail("Expected UnsupportedOperationException");
        }
    }

}