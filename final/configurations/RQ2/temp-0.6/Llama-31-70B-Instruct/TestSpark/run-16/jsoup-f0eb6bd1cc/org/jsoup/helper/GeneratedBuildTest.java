package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import static org.junit.Assert.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

import org.mockito.Mockito;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        URL url = urlBuilder.build();
        assertNull(url);
    }

}