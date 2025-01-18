package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedBuildInvalidUrlTest {

    @Test
    public void BuildInvalidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build(); // This should throw IllegalArgumentException
    }

}