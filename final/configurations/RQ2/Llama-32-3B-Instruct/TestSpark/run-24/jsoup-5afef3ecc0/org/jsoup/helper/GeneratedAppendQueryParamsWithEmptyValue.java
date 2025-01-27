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

public class GeneratedAppendQueryParamsWithEmptyValue {

    @Test
    public void appendQueryParamsWithEmptyValue() throws UnsupportedEncodingException, URISyntaxException {
        URL inputUrl = new URL("http://example.com");
        Connection.KeyVal kv = new Connection.KeyVal("key", "");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        try {
            urlBuilder.appendKeyVal(kv);
            assertEquals(new URI(inputUrl.getScheme(), inputUrl.getHost(), 80, inputUrl.getPath() + "?key=" + URLEncoder.encode("", DataUtil.UTF_8), null).toURL(), urlBuilder.build());
            fail("Expected URIException");
        } catch (URISyntaxException e) {
        }
    }

}