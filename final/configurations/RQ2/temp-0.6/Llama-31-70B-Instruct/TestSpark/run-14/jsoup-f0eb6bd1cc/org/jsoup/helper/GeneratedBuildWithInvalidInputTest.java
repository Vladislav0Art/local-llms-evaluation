package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedBuildWithInvalidInputTest {

    @Test
    public void buildWithInvalidInputTest() throws MalformedURLException {
        UrlBuilder builder = new UrlBuilder(new URL("invalid"));
        URL url = builder.build();
        assertNull(url);
    }

}