package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildInvalidUrlTest {

    @Test
    public void buildInvalidUrlTest() {
        try {
            URL url = new URL("invalid-url");
            UrlBuilder urlBuilder = new UrlBuilder(url);
            urlBuilder.build();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}