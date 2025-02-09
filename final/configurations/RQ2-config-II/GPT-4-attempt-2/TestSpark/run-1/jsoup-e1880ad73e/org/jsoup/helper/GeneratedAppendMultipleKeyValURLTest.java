package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class GeneratedAppendMultipleKeyValURLTest {

    @Test
    public void appendMultipleKeyValURLTest() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.google.com"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("key2", "value"));
        URL outputUrl = urlBuilder.build();
        assertEquals("http://www.google.com?key1=value&key2=value", URLDecoder.decode(outputUrl.toString(), StandardCharsets.UTF_8.toString()));
    }

}