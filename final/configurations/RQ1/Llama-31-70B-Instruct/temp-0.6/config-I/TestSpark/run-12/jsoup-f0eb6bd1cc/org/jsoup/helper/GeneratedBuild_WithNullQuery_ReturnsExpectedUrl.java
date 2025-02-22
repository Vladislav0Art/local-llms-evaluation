package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_WithNullQuery_ReturnsExpectedUrl {

    private static final String UTF_8 = StandardCharsets.UTF_8.name();

    @Mock
    private URL inputUrl;

    @Test
    public void build_WithNullQuery_ReturnsExpectedUrl() throws URISyntaxException {
        when(inputUrl.getProtocol()).thenReturn("https");
        when(inputUrl.getHost()).thenReturn("example.com");
        when(inputUrl.getPath()).thenReturn("/");
        when(inputUrl.getQuery()).thenReturn(null);

        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL url = builder.build();

        Assert.assertEquals("https://example.com/", url.toString());
    }

}