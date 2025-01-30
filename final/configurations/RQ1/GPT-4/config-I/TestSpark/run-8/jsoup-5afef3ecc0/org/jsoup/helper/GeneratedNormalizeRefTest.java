package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class GeneratedNormalizeRefTest {

    @Test
    public void normalizeRefTest() {
        String ref = "anchor Name";
        String actual = UrlBuilder.normalizeRef(ref);
        String expected = "anchor%20Name";
        Assert.assertEquals(expected, actual);
    }

}