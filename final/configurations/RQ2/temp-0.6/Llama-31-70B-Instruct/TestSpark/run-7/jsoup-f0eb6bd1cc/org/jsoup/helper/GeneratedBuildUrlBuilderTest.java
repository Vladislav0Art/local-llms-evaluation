package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.DataUtil;
import org.mockito.Mockito;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedBuildUrlBuilderTest {

    @Mock
    private Connection.KeyVal mockKeyVal;

    @Test
    public void buildUrlBuilderTest() throws MalformedURLException {
        URL testUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        assertNotNull(urlBuilder);
    }

}