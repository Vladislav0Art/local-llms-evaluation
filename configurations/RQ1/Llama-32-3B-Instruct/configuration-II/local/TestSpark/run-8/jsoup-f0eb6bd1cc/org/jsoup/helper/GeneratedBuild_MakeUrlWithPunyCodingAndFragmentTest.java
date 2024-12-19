package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class GeneratedBuild_MakeUrlWithPunyCodingAndFragmentTest {

    @Test
    public void build_MakeUrlWithPunyCodingAndFragmentTest() {
        URL u = new URL("http://example.com/path?query=string#anchor");
        UrlBuilder builder = new UrlBuilder(u);
        URL normalizedUrl = builder.build();
        // Test expected normalized URL with fragment
    }

}