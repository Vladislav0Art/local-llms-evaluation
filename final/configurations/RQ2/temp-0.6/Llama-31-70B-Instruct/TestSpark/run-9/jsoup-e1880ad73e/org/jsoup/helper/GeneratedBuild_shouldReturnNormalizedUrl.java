package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_shouldReturnNormalizedUrl {

    private UrlBuilder urlBuilder;
    private URL inputUrl;

    @Before
    public void setUp() throws Exception {
        inputUrl = mock(URL.class);
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void build_shouldReturnNormalizedUrl() throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
        //given
        String expectedNormalizedUrl = "http://example.com";

        //when
        URL normalizedUrl = urlBuilder.build();

        //then
        assertEquals(expectedNormalizedUrl, normalizedUrl.toString());
    }

}