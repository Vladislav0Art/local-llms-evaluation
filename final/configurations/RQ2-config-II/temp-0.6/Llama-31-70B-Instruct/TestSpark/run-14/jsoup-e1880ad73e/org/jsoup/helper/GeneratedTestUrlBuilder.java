package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() throws MalformedURLException, UnsupportedEncodingException, URISyntaxException {
        URL inputUrl = new URL("https://example.com/test?key=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("newKey", "newValue", "UTF-8");
        urlBuilder.appendKeyVal(kv);
        URL resultUrl = urlBuilder.build();
        assertEquals("https://example.com/test?key=value&newKey=newValue", resultUrl.toString());
    }

}