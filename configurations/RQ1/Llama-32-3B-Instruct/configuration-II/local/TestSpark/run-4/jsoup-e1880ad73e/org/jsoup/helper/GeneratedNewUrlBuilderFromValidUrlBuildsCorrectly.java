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

public class GeneratedNewUrlBuilderFromValidUrlBuildsCorrectly {

    @Test
    public void newUrlBuilderFromValidUrlBuildsCorrectly() throws MalformedURLException, URISyntaxException {
        String url = "http://example.com/path?query=abc#ref";
        URL inputUrl = new URL(url);
        UrlBuilder builder = new UrlBuilder(inputUrl);

        assertEquals(new URL("http://example.com/path"), builder.build());
    }

}