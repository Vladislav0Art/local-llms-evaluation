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
public class GeneratedBuildUrlFromInvalidInputResultInMalformedURLException {

    @Mock
    private Connection connection;

    @Mock
    private String urlEncoder;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void buildUrlFromInvalidInputResultInMalformedURLException() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL("invalid://input"));
        try {
            builder.build();
            assert false;
        } catch (MalformedURLException e) {
            // expected
        }
    }

}