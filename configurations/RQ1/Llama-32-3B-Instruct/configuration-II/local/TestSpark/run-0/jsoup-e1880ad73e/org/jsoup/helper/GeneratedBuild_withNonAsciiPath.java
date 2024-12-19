package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
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
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_withNonAsciiPath {

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void build_withNonAsciiPath() {
        URL u = new URL("http://example.com/áth?query=123&ref=f#anchor");
        UrlBuilder urlBuilder = new UrlBuilder(u);
        URL result = urlBuilder.build();
        assertEquals(new URL("http://example.com/%C3%A1th"), result);
    }

}