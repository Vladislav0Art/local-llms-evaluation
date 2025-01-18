package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedBuild_WithValidInputUrl_Test {

    @Test
    public void build_WithValidInputUrl_Test() {
        try {
            URL inputUrl = new URL("https://this.is.a.valid.url/path");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

            URL outputUrl = urlBuilder.build();

            Assert.assertNotNull(outputUrl);
            Assert.assertEquals(inputUrl, outputUrl);
        } catch (MalformedURLException e) {
            // This wouldn't occur as the URL supplied is valid
        }
    }

}