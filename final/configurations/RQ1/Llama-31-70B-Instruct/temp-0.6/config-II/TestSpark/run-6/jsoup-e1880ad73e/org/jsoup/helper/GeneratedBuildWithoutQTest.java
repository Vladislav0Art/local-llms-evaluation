package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildWithoutQTest {

    @Test
    public void buildWithoutQTest() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL actual = builder.build();
        assertEquals("http://example.com/", actual.toString());
    }

}