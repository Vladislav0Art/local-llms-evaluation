package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_urlDecodedPath {

    @Mock
    private Connection.KeyVal kv;

    @Mock
    private URI uri;

    @Mock
    private URL url;

    @Test
    public void build_urlDecodedPath() throws MalformedURLException, URISyntaxException {
        String baseUrl = "http://example.com";
        URI path = new URI("http%3A%2F%2Fexample.com/path");
        UrlBuilder builder = new UrlBuilder(baseUrl);
        URL expectedUrl = new URL(baseUrl + path.getQuery());
        assertEquals(expectedUrl, builder.build());
    }

}