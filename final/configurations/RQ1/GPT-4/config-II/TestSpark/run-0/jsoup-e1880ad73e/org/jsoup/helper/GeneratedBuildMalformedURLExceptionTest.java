package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedBuildMalformedURLExceptionTest {

    @Test
    public void buildMalformedURLExceptionTest() throws MalformedURLException {
        URL url = new URL("invalidUrl");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

}