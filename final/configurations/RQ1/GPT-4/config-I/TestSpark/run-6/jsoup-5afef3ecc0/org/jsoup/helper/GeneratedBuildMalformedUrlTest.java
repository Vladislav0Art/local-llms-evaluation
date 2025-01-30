package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.Validate;
import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

public class GeneratedBuildMalformedUrlTest {

    @Test
    public void buildMalformedUrlTest() throws Exception {
        URL url = new URL("http:/example.com");
        UrlBuilder builder = new UrlBuilder(url);
        builder.build();
    }

}