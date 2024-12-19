package org.jsoup.helper;

import org.jsoup.Connection;
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

public class GeneratedBuildUrlFromValidUrl_FragmentPreserved {

    @Test
    public void buildUrlFromValidUrl_FragmentPreserved() {
        URL inputUrl = new URL("https://example.com#anchor");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL(builder.build().getProtocol(), builder.build().getHost(), builder.build().getPath());
        assertEquals(expectedUrl, new URL("https://example.com#anchor"));
    }

}