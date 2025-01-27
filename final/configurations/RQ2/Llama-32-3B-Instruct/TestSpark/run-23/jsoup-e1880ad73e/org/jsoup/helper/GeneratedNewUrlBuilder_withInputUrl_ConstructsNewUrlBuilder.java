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
public class GeneratedNewUrlBuilder_withInputUrl_ConstructsNewUrlBuilder {

    private MockUrl urlMock() {
        return mock(URL.class);
    }

    @Test
    public void newUrlBuilder_withInputUrl_ConstructsNewUrlBuilder() {
        UrlBuilder expected = new UrlBuilder(urlMock());
        assertEquals(expected, new UrlBuilder(urlMock()));
    }

}