package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedBuild_urlDecodesPathTest {

    private String inputUrl = "http://example.com";
    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        urlBuilder = new UrlBuilder(new URL(inputUrl));
    }

    @Test
    public void build_urlDecodesPathTest() throws UnsupportedEncodingException {
        String inputPath = "Hello%2CWorld";
        urlBuilder.appendKeyVal(Connection.KeyVal.of("path", inputPath));
        URL expectedUrl = new URL("http://example.com/path?query=value");
        assertThat(urlBuilder.build(), is(expectedUrl));
    }

}