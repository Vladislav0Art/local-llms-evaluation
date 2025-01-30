package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildInvaildUrlTest {

    @Test
    public void buildInvaildUrlTest() throws Exception {
        URL url = new URL("this.is.wrong");
        UrlBuilder builder = new UrlBuilder(url);
        builder.build();
    }

}