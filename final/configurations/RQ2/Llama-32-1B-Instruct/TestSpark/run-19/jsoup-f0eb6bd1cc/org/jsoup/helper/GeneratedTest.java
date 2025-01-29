package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void build_URL() {
        String inputUrl = "https://example.com/path";
        URLBuilder urlBuilder = new UrlBuilder(new URI(inputUrl));
        Uri uri = urlBuilder.build();
        assertNotNull(uri);
        assert !uri.isAbsolute();
        try {
            DataUtil.decode(uri.toString());
            fail("Expected exception not thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void build_URL_absolute() {
        String inputUrl = "https://example.com/path";
        URLBuilder urlBuilder = new UrlBuilder(new URI(inputUrl));
        Uri uri = urlBuilder.build();
        assertNotNull(uri);
        assert !uri.isAbsolute();
        try {
            DataUtil.decode(uri.toString());
            fail("Expected exception not thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void appendKeyVal() {
        String inputKV = "key=value";
        String expectedKV = "key=value";
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path"));
        urlBuilder.appendKeyVal(inputKV);
        assertEquals(expectedKV, urlBuilder.build().toURL().toString());
    }

    @Test
    public void appendKeyVal_missing() {
        String inputKV = "key=value";
        String expectedKV = null;
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path"));
        urlBuilder.appendKeyVal(inputKV);
        assert null == urlBuilder.build().toURL().toString();
    }

    @Test
    public void appendKeyVal_empty() {
        String inputKV = "";
        String expectedKV = "";
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path"));
        urlBuilder.appendKeyVal(inputKV);
        assertEquals(expectedKV, urlBuilder.build().toURL().toString());
    }

    @Test
    public void appendKeyVal_not_empty() {
        String inputKV = "key=value";
        String expectedKV = "key=value";
        UrlBuilder urlBuilder = new UrlBuilder(new URI("https://example.com/path"));
        urlBuilder.appendKeyVal(inputKV);
        assertEquals(expectedKV, urlBuilder.build().toURL().toString());
    }

}