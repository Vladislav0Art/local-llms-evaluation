package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import static org.mockito.Mockito.*;

public class GeneratedBuildURLWithPunyCodeTest {

    @Test
    public void buildURLWithPunyCodeTest() throws MalformedURLException, URISyntaxException {
        URL url = new URL("http://äxample.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        URL expectedURL = new URL("http://xn--xample-4vae.com/");
        URL actualURL = urlBuilder.build();

        Assert.assertEquals(expectedURL, actualURL);
    }

}