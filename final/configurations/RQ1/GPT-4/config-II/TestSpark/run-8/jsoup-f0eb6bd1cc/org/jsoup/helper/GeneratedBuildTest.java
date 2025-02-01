package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.nio.charset.Charset;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws Exception {
        URL url = new URL("http://www.google.com");

        UrlBuilder urlBuilder = new UrlBuilder(url);

        URL newUrl = urlBuilder.build();

        Assert.assertEquals(newUrl.getHost(), url.getHost());
    }

}