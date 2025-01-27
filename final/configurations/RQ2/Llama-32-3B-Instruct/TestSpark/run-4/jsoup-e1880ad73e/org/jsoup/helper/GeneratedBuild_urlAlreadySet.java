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
public class GeneratedBuild_urlAlreadySet {

    @Mock
    private Connection.KeyVal kv;

    @Mock
    private URI uri;

    @Mock
    private URL url;

    @Test
    public void build_urlAlreadySet() {
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(url, builder.build());
    }

}