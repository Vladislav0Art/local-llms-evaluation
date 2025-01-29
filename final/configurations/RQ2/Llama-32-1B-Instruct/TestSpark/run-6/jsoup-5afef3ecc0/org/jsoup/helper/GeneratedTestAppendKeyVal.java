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

public class GeneratedTestAppendKeyVal {

    public static class URLMapperTest {

        @Test
        public void testAppendKeyVal() throws UnsupportedEncodingException, MalformedURLException {
            URLMapper mapper = new URLMapper();
            String urlBase = "https://example.com";
            UrlBuilder builder = new UrlBuilder(urlBase);
            UrlBuilder.AppendsKeyVal appendsKeyVal = new UrlBuilder.AppendsKeyVal(mapper);
            builder.appendKeyVal(appendsKeyVal);
            Assert.assertEquals("https://example.com?appendsKeyVal=true", buildString(urlBase));
        }
    }

}