package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedBuild_PathyEncodingTest {

    @Test
    public void build_PathyEncodingTest() {
        URL u = new URL("http://example.com/à?test#ref");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("http://example.com/&#224;?test#ref", ((URL) builder.build()).getPath());
    }

}