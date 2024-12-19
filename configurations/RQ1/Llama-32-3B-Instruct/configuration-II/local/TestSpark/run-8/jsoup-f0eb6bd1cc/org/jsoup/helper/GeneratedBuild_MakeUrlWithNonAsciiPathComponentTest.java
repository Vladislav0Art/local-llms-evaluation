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

public class GeneratedBuild_MakeUrlWithNonAsciiPathComponentTest {

    @Test
    public void build_MakeUrlWithNonAsciiPathComponentTest() {
        String path = "\u00A0\u00B1"; // Non-ASCII space
        URL u = new URL("http://example.com/path?" + path);
        UrlBuilder builder = new UrlBuilder(u);
        URL normalizedUrl = builder.build();
        // Test expected normalized URL with non-ASCII path component
    }

}