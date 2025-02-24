package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void buildTest() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertNotNull(outputUrl);
        assertEquals("https", outputUrl.getProtocol());
        assertEquals("example.com", outputUrl.getHost());
        assertEquals(-1, outputUrl.getPort());
        assertEquals("/", outputUrl.getPath());
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value", false);
        kv.setKey("key");
        kv.setValue("value");
        urlBuilder.appendKeyVal(kv);
        assertEquals("key", kv.getKey());
        assertEquals("value", kv.getValue());
    }

}