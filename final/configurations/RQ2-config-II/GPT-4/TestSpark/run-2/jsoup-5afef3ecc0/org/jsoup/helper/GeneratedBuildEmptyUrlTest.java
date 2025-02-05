package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildEmptyUrlTest {

    @Test
    public void buildEmptyUrlTest() throws MalformedURLException {
        URL url = new URL("");
        UrlBuilder builder = new UrlBuilder(url);
        builder.build();
    }

}