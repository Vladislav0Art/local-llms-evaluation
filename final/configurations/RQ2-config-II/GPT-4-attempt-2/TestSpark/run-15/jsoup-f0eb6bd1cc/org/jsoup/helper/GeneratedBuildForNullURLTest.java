package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildForNullURLTest {

    @Test
    public void buildForNullURLTest() {
        URL url = null;
        UrlBuilder builder = new UrlBuilder(url);
        builder.build();
    }

}