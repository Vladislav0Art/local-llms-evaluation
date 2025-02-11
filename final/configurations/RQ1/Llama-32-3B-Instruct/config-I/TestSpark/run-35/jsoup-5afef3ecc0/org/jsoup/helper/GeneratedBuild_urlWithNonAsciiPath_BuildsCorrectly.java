package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedBuild_urlWithNonAsciiPath_BuildsCorrectly {

    @Test
    public void build_urlWithNonAsciiPath_BuildsCorrectly() {
        URL inputUrl = new URL("http://example.com/path?query=foo#ref");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        assertNotNull(builder.u);
        assertTrue(StringUtil.isASCII(builder.u.getAuthority()));
    }

}