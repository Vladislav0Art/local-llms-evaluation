package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testBuild() {
        String inputUrl = "https://example.com/path/to/resource";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("https://example.com/path/to/resource", urlBuilder.build().toString());
    }

    @Test
    public void testAppendKeyVal_1() throws UnsupportedEncodingException {
        URL url = "https://example.com/path/to/resource";
        KeyVal kv = new KeyVal("param1", "value1");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(kv.toString(), urlBuilder.appendKeyVal(kv).toString());
    }

    @Test
    public void testAppendKeyVal_2() throws UnsupportedEncodingException {
        String inputUrl = "https://example.com/path/to/resource";
        KeyVal kv = new KeyVal("param1", "value1");
        urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(kv.toString(), urlBuilder.appendKeyVal(kv).toString());
    }

    @Test
    public void testAppendKeyVal_3() throws UnsupportedEncodingException {
        String inputUrl = "https://example.com/path/to/resource";
        KeyVal kv = new KeyVal("param1", "value1");
        URLBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(kv.toString(), urlBuilder.appendKeyVal(kv).toString());
    }

    @Test
    public void testAppendKeyVal_4() throws UnsupportedEncodingException {
        String inputUrl = "https://example.com/path/to/resource";
        KeyVal kv = new KeyVal("param1", "value1");
        urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(kv.toString(), urlBuilder.appendKeyVal(kv).toString());
    }

    @Test
    public void testBuild_2() throws UnsupportedEncodingException {
        String inputUrl = "https://example.com/path/to/resource";
        KeyVal kv = new KeyVal("param1", "value1");
        URLBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(kv.toString(), urlBuilder.appendKeyVal(kv).toString());
    }

    @Test
    public void testAppendKeyVal_5() throws UnsupportedEncodingException {
        String inputUrl = "https://example.com/path/to/resource";
        KeyVal kv = new KeyVal("param1", "value1");
        URLBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(kv.toString(), urlBuilder.appendKeyVal(kv).toString());
    }

    @Test
    public void testAppendKeyVal_6() throws UnsupportedEncodingException {
        String inputUrl = "https://example.com/path/to/resource";
        KeyVal kv = new KeyVal("param1", "value1");
        URLBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(kv.toString(), urlBuilder.appendKeyVal(kv).toString());
    }

    @Test
    public void testAppendKeyVal_7() throws UnsupportedEncodingException {
        String inputUrl = "https://example.com/path/to/resource";
        KeyVal kv = new KeyVal("param1", "value1");
        URLBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(kv.toString(), urlBuilder.appendKeyVal(kv).toString());
    }

    @Test
    public void testAppendKeyVal_8() throws UnsupportedEncodingException {
        String inputUrl = "https://example.com/path/to/resource";
        KeyVal kv = new KeyVal("param1", "value1");
        urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(kv.toString(), urlBuilder.appendKeyVal(kv).toString());
    }

    @Test
    public void testAppendKeyVal_9() throws UnsupportedEncodingException {
        String inputUrl = "https://example.com/path/to/resource";
        KeyVal kv = new KeyVal("param1", "value1");
        URLBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(kv.toString(), urlBuilder.appendKeyVal(kv).toString());
    }

}