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

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_WithoutKeyVal_ReturnsInputUrl {

    private MockUrl urlMock() {
        return mock(URL.class);
    }

    @Test
    public void build_WithoutKeyVal_ReturnsInputUrl() throws MalformedURLException {
        URL inputUrl = urlMock();
        when(kv).thenReturn(null);

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(inputUrl, urlBuilder.build());
    }

}