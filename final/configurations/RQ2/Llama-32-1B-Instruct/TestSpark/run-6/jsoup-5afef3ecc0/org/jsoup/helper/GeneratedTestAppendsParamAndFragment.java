package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class GeneratedTestAppendsParamAndFragment {

    public static class URLMapperTest {

        @Test
        public void testAppendsParamAndFragment() throws UnsupportedEncodingException, MalformedURLException {
            URLMapper mapper = new URLMapper();
            String urlBase = "https://example.com";
            UrlBuilder builder = new UrlBuilder(urlBase);
            builder.appendParam(mapper);
            builder.appendFragment(mapper);
            Assert.assertEquals("https://example.com?appendsKeyVal=true#appendsKeyVal=true", buildString(urlBase));
        }
    }

}