package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedBuildInvalidUrlTest {

    @Test
    public void buildInvalidUrlTest() throws MalformedURLException {
        // Assuming ctor with malformed URL throws MalformedURLException
        URL inputUrl = new URL("htt://badexample");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtUrl = urlBuilder.build();
    }

}