package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
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

import static org.jsoup.helper.DataUtil.UTF_8;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestBuild {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() throws Exception {
        URL url = Mockito.mock(URL.class);
        Mockito.when(url.getQuery()).thenReturn("query");
        urlBuilder = new UrlBuilder(url);
    }

    @Test
    public void testBuild() throws Exception {
        URL url = urlBuilder.build();
        Assert.assertEquals(url.getProtocol(), IDN.toASCII("www.example.com"));
        Assert.assertEquals(url.getHost(), IDN.toASCII("www.example.com"));
        Assert.assertEquals(url.getPath(), decodePart("/path"));
    }

}