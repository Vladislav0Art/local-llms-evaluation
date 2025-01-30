package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;

import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedBuildInvalidURLTest {

    @Test
    public void buildInvalidURLTest() throws MalformedURLException {
        URL invalidUrl = new URL("http://exa[mple.com");
        UrlBuilder urlBuilder = new UrlBuilder(invalidUrl);
        urlBuilder.build();
    }

}