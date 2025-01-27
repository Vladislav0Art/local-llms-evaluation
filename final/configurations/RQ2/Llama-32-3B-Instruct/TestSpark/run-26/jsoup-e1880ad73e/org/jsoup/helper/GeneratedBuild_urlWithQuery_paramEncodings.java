package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedBuild_urlWithQuery_paramEncodings {

    @Test
    public void build_urlWithQuery_paramEncodings() throws MalformedURLException, URISyntaxException {
        String inputUrl = "https://example.com/path?a=1&b=%C2%BC";
        URL url = new URL(inputUrl);
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals("https://example.com/path?a=1&b=%E2%80%A6", urlBuilder.build().toString());
    }

}