package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrlWithValidInputReturnsCorrectUrlObject {

    @Mock
    private Connection connection;

    @Mock
    private String urlEncoder;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void buildUrlWithValidInputReturnsCorrectUrlObject() throws Exception {
        String inputUrl = "http://example.com/path/to/resource";
        UrlBuilder builder = new UrlBuilder(new URL(inputUrl));
        assertEquals(new URL("http://example.com" + URI.encode(inputUrl)), builder.build());
    }

}