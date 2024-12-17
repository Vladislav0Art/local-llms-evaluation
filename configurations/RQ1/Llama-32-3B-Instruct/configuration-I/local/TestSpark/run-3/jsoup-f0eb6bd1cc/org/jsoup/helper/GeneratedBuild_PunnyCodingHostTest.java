package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedBuild_PunnyCodingHostTest {

    @Test
    public void build_PunnyCodingHostTest() {
        URL u = new URL("http://example.com/test");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("http://xn--c1ck1d.xn--0x2v35b.net/test", ((URL) builder.build()).getHost());
    }

}