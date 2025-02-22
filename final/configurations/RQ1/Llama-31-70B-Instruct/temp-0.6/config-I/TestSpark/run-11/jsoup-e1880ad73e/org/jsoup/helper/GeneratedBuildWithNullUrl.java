package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithNullUrl {

    @Test
    public void buildWithNullUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        URL url = urlBuilder.build();
        assertEquals(null, url);
    }

}