package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL testURL = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testURL);

        URL resultURL = urlBuilder.build();
        Assert.assertNotNull(resultURL);
        Assert.assertEquals(testURL.toString(), resultURL.toString());
    }

}