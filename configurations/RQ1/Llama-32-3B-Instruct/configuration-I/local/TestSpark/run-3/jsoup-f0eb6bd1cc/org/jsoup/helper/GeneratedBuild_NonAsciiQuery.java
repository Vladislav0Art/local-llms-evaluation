package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedBuild_NonAsciiQuery {

    @Test
    public void build_NonAsciiQuery() {
        URL u = new URL("http://example.com/à?test#ref");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("?à?test#ref", ((URL) builder.build()).getQuery());
    }

}