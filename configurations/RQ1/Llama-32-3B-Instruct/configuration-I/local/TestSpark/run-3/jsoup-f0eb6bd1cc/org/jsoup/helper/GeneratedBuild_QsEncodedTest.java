package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedBuild_QsEncodedTest {

    @Test
    public void build_QsEncodedTest() {
        URL u = new URL("http://example.com/test?name=Jane&age=30");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("http://example.com/test?name=Jane%26age=30", ((URL) builder.build()).getQuery());
    }

}