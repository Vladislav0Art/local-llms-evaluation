package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedBuildURLWithQueryTest {

    @Test
    public void buildURLWithQueryTest() throws MalformedURLException {
        URL url = new URL("http://jsoup.org?query=test");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();
        assertNotNull(builtUrl);
        assertEquals(url.toString(), builtUrl.toString());
    }

}