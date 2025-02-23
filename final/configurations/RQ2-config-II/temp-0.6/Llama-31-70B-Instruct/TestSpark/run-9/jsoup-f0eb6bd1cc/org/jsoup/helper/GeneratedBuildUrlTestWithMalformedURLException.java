package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedBuildUrlTestWithMalformedURLException {

    @Test
    public void buildUrlTestWithMalformedURLException() throws URISyntaxException, UnsupportedEncodingException {
        //given
        String url = "http://example.com/test?q=123&p=456";
        URL inputUrl = new URL(url);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        //when
        assertThrows(MalformedURLException.class, urlBuilder.build());
    }

}