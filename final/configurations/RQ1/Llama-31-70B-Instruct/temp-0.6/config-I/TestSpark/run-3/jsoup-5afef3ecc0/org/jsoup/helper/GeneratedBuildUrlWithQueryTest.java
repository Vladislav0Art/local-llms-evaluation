package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import org.junit.Assert;

public class GeneratedBuildUrlWithQueryTest {

    @Test
    public void buildUrlWithQueryTest() throws MalformedURLException, URISyntaxException, UnknownHostException {
        URL inputUrl = new URL("http://example.com?param1=value1&param2=value2");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL url = urlBuilder.build();
        Assert.assertEquals("http://example.com?param1=value1&param2=value2", url.toString());
    }

}