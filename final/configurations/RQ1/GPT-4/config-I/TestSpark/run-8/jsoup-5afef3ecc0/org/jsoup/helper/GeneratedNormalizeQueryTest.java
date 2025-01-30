package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class GeneratedNormalizeQueryTest {

    @Test
    public void normalizeQueryTest() {
        String query = "param value";
        String actual = UrlBuilder.normalizeQuery(query);
        String expected = "param+value";
        Assert.assertEquals(expected, actual);
    }

}