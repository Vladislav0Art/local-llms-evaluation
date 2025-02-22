package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.internal.StringUtil;

import static org.jsoup.helper.DataUtil.UTF_8;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.IDN;
import javax.annotation.Nullable;

public class GeneratedBuildUrlWithRef {

    @Test
    public void buildUrlWithRef() {
        URL inputUrl = new URL("http://www.example.com#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL result = urlBuilder.build();
        assertEquals("http://www.example.com#anchor", result.toString());
    }

}