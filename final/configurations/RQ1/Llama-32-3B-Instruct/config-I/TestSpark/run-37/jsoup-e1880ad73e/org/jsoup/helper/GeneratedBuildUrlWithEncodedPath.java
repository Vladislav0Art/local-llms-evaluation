package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
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

public class GeneratedBuildUrlWithEncodedPath {

    @Mock
    private Connection connection;

    @Test
    public void buildUrlWithEncodedPath() throws Exception {
        // given
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/path?query"));

        // when
        URL url = urlBuilder.build();

        // then
        Mockito.verify(url).getPath().withValue("%2Fpath");
    }

}