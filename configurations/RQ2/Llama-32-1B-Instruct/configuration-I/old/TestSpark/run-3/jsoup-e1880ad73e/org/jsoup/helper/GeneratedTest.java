package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void testBuild() {
        String inputUrl = "https://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL actualUrl = urlBuilder.build();
        System.out.println(actualUrl.toString());
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");

        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);

        URI actualUri = urlBuilder.build();
        System.out.println(actualUri.toString());
    }

    @Test
    public void testAppendKeyValUnsupportedEncoding() throws UnsupportedEncodingException {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");

        urlBuilder.appendKeyVal(kv1);
        try {
            urlBuilder.appendKeyVal(kv2, StandardCharsets.UTF_8);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
        }

        URI actualUri = urlBuilder.build();
        System.out.println(actualUri.toString());
    }

}