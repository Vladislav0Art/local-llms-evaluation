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

public class GeneratedTestUrlMapper {

    public static class URLMapperTest {

        @Test
        public void testUrlMapper() throws Exception {
            String baseUrl = "https://example.com";
            String[] expectedResult = {"https://example.com", "http://example.com"};
            Assert.assertEquals(Arrays.asList(expectedResult), buildString(baseUrl));
        }
    }

}