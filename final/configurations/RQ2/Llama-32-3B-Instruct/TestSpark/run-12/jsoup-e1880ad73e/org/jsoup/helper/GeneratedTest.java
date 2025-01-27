package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void newUrlBuilder_withUrlIsCorrect() {
        URL url = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(url);
        assertTrue(builder.build().toURI().getScheme());
    }

    @Test
    public void appendKeyVal_appendKeyValCorrectly() throws UnsupportedEncodingException, URISyntaxException {
        String host = "example.com";
        String path = "/path/to/resource";
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL(host));
        builder.appendKeyVal(kv);
        assertEquals(host + path, (new UrlBuilder(builder.build()).build().toURI().getScheme() + "://" + new UrlBuilder(builder.build()).build().toURI().getPath()));
    }

    @Test
    public void appendKeyVal_appendEmptyStringCorrectly() throws UnsupportedEncodingException, URISyntaxException {
        String host = "example.com";
        String path = "/path/to/resource";
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("key", "");
        UrlBuilder builder = new UrlBuilder(new URL(host));
        builder.appendKeyVal(kv);
        assertEquals(host + path, (new UrlBuilder(builder.build()).build().toURI().getScheme() + "://" + new UrlBuilder(builder.build()).build().toURI().getPath()));
    }

    @Test
    public void appendKeyVal_appendNullCorrectly() throws UnsupportedEncodingException, URISyntaxException {
        String host = "example.com";
        String path = "/path/to/resource";
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("key", null);
        UrlBuilder builder = new UrlBuilder(new URL(host));
        assertEquals(host + path, (new UrlBuilder(builder.build()).build().toURI().getScheme() + "://" + new UrlBuilder(builder.build()).build().toURI().getPath()));
    }

    @Test
    public void appendKeyVal_keyAndValueAreEncodedCorrectly() throws UnsupportedEncodingException {
        String host = "example.com";
        String path = "/path/to/resource";
        Connection.KeyVal kv = new org.jsoup.Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL(host));
        assertEquals(URLEncoder.encode("key") + "=" + URLEncoder.encode("value"), (new UrlBuilder(builder.build()).build().toURI().getScheme() + "://" + new UrlBuilder(builder.build()).build().toURI().getPath()));
    }

}