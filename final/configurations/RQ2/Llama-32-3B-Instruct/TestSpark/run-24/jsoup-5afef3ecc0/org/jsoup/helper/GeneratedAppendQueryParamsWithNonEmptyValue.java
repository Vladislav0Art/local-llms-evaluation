package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;

import org.jsoup.Connection.KeyVal;

public class GeneratedAppendQueryParamsWithNonEmptyValue {

    @Test
    public void appendQueryParamsWithNonEmptyValue() throws UnsupportedEncodingException, URISyntaxException {
        URL inputUrl = new URL("http://example.com");
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        try {
            urlBuilder.appendKeyVal(kv);
            assertEquals(new URI(inputUrl.getScheme(), inputUrl.getHost(), 80, inputUrl.getPath() + "?key=value", null).toURL(), urlBuilder.build());
            assert true : false;
        } catch (URISyntaxException e) {
        }
    }

}