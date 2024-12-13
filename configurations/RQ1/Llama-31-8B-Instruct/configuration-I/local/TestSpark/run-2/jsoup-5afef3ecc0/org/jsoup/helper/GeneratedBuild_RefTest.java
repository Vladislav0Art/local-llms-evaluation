package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import org.jsoup.Connection.KeyVal;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_RefTest {

    @Test
    public void build_RefTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new KeyVal("key", "value"));
        urlBuilder.appendKeyVal(new KeyVal("ref", "anchor"));
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("http://example.com/path?key=value#anchor", result.toString());
    }

}