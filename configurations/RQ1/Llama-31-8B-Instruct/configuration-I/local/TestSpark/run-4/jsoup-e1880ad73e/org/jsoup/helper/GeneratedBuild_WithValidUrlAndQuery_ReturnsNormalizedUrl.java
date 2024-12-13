package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedBuild_WithValidUrlAndQuery_ReturnsNormalizedUrl {

    @Test
    public void build_WithValidUrlAndQuery_ReturnsNormalizedUrl() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://example.com/path with spaces");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("http://example.com/path%20with%20spaces?key=value", result.toString());
    }

}