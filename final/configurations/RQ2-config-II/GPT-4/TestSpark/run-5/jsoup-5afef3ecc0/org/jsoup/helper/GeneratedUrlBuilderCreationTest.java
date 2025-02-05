package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderCreationTest {

    @Test
    public void urlBuilderCreationTest() throws MalformedURLException {
        URL testURL = new URL("http://testurl.com");
        UrlBuilder urlBuilder = new UrlBuilder(testURL);

        assertNotNull(urlBuilder);
    }

}