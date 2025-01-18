package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilderConstructorMalformedUrlExceptionTest {

    @Test
    public void UrlBuilderConstructorMalformedUrlExceptionTest() throws MalformedURLException {
        URL inputUrl = new URL("htp:/nonexistent.url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
    }

}