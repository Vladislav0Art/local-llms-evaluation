package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildInvalidUrlTest {

    @Test
    public void buildInvalidUrlTest() throws Exception {
        URL testUrl = new URL("invalidUrl");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        urlBuilder.build();
    }

}