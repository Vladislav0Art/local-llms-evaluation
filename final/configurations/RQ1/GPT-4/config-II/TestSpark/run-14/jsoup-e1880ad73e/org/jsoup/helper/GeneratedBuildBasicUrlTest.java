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

public class GeneratedBuildBasicUrlTest {

    @Test
    public void buildBasicUrlTest() throws Exception {
        URL url = new URL("http://www.test.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL newUrl = urlBuilder.build();
        assertEquals(newUrl, url);
    }

}