package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildInvalidUrlTest {

    @Test
    public void buildInvalidUrlTest() throws MalformedURLException {
        URL testUrl = new URL("http:\\test-invalid-url");
        UrlBuilder builder = new UrlBuilder(testUrl);
        builder.build();
    }

}