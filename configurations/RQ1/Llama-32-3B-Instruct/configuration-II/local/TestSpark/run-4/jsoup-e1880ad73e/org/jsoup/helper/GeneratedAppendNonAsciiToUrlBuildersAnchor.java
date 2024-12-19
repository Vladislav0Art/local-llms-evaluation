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
import java.util.ArrayList;
import java.util.List;

public class GeneratedAppendNonAsciiToUrlBuildersAnchor {

    @Test
    public void appendNonAsciiToUrlBuildersAnchor() throws UnsupportedEncodingException, MalformedURLException, URISyntaxException {
        String url = "http://example.com/path?query=abc#ref";
        Connection.KeyVal[] kv = {new Connection.KeyVal("a", "äb")};
        URL inputUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(inputUrl);

        for (Connection.KeyVal keyVal : kv) {
            builder.appendKeyVal(keyVal);
        }

        assertEquals(new URL("http://example.com/path?query=abcb#ref"), builder.build());
    }

}