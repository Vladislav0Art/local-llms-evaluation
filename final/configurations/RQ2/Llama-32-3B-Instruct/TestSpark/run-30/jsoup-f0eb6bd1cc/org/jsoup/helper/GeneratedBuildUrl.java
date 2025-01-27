package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrl {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.helper.UrlBuilderTest");
    }

    @Test
    public void buildUrl() throws URISyntaxException, MalformedURLException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        URI uri = Mockito.spy(new URI("http://example.com/path?query=value#fragment"));
        Mockito.when(uri.getScheme()).thenReturn(Mockito.anyString());
        Mockito.when(uri.getHost()).thenReturn(Mockito.anyString());
        Mockito.when(uri.getPath()).thenReturn(Mockito.anyString());
        Mockito.when(uri.getQuery()).thenReturn(Mockito.anyString());
        Mockito.when(uri.getFragment()).thenReturn(Mockito.anyString());

        URL url = builder.build();
        Assert.assertEquals("http://example.com", url.getScheme());
        Assert.assertEquals("example.com", url.getHost());
        Assert.assertEquals("/path", url.getPath());
        Assert.assertEquals("query=value", url.getQuery());
        Assert.assertEquals("#fragment", url.getFragment());
    }

}