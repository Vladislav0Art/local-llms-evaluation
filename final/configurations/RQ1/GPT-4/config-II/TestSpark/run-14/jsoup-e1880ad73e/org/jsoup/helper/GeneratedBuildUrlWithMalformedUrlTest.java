package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildUrlWithMalformedUrlTest {

    @Test
    public void buildUrlWithMalformedUrlTest() throws Exception {
        URL url = new URL("ht://www.test.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertThrows(Exception.class, urlBuilder::build);
    }

}