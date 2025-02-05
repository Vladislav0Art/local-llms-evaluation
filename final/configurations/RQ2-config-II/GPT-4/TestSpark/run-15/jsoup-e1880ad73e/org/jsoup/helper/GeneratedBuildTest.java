package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        URL inputUrl = null;
        try {
            inputUrl = new URL("https://example.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        Assert.assertNotNull(outputUrl);
    }

}