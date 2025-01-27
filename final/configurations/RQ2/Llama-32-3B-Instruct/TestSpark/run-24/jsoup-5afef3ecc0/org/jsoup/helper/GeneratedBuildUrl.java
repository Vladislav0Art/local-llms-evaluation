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

public class GeneratedBuildUrl {

    @Test
    public void buildUrl() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL expectedUrl = new URL(inputUrl.getProtocol(), inputUrl.getHost(), 80, inputUrl.getPath(), null);
        assertEquals(expectedUrl, urlBuilder.build());
    }

}