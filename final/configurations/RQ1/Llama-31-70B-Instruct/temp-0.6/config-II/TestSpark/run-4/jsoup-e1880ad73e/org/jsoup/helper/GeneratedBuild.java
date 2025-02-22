package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.URLEncoder.encode;
import java.net.URLDecoder.decode;

import org.jsoup.helper.StringUtil;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedBuild {

    @Test
    public void build() throws UnsupportedEncodingException, URISyntaxException, MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder u = new UrlBuilder(inputUrl);

        URL result = u.build();

        assertEquals("http://example.com", result.toExternalForm());
    }

}