package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedBuildMalformedUrlTest {

    @Test
    public void buildMalformedUrlTest() {
        try {
            URL url1 = new URL("https:www.google.com/");
            UrlBuilder urlBuilder = new UrlBuilder(url1);
            urlBuilder.build();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}