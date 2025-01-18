package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildUrlConstructorExceptionTest {

    @Test
    public void buildUrlConstructorExceptionTest() throws MalformedURLException {
        URL inputUrl = new URL("invalid");
        UrlBuilder builder = new UrlBuilder(inputUrl);
    }

}