package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithEmptyUrlTest {

    @Test
    public void buildWithEmptyUrlTest() throws MalformedURLException {
        URL url = new URL("");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

}