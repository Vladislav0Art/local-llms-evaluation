package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnsupportedEncodingException;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class GeneratedBuildInvalidUrlTest {

    @Test
    public void buildInvalidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("ht:/example");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.build();
    }

}