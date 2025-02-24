package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrl {

    private static final String DUMMY_URL = "http://dummy.com";
    private static final String DUMMY_KEY = "key";
    private static final String DUMMY_VALUE = "value";
    private static final String DUMMY_ENCODED_VALUE = "dummy%20value";

    @Test
    public void buildUrl() throws URISyntaxException, MalformedURLException {
        URL inputUrl = new URL(DUMMY_URL);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        assertEquals(inputUrl, resultUrl);
    }

}