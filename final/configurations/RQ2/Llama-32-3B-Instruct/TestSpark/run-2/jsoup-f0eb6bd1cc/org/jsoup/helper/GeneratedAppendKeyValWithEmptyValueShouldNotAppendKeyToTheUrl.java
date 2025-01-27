package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.IDN;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;

public class GeneratedAppendKeyValWithEmptyValueShouldNotAppendKeyToTheUrl {

    @Test
    public void appendKeyValWithEmptyValueShouldNotAppendKeyToTheUrl() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        Connection.KeyVal kv = new Connection.KeyVal("key", "");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        String outputUrl = urlBuilder.build().toString();
        assertFalse(outputUrl.contains("?key="));
    }

}