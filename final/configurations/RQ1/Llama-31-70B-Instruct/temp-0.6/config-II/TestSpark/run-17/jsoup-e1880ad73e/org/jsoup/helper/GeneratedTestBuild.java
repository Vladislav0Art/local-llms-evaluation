package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

public class GeneratedTestBuild {

    @Test
    public void testBuild() throws Exception {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("http://example.com");

        URL actualUrl = urlBuilder.build();

        Assert.assertEquals(expectedUrl, actualUrl);
    }

}