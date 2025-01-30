package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.mockito.Mockito.*;

public class GeneratedBuildURLWithQueryTest {

    @Test
    public void buildURLWithQueryTest() throws MalformedURLException, URISyntaxException {
        URL url = new URL("http://example.com?query=test");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        URL expectedURL = new URL("http://example.com/?query=test");
        URL actualURL = urlBuilder.build();

        Assert.assertEquals(expectedURL, actualURL);
    }

}