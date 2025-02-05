package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedBuildTest_ValidUrlBuilder {

    @Test
    public void buildTest_ValidUrlBuilder() throws MalformedURLException {
        URL validInputUrl = new URL("https://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(validInputUrl);

        URL outputUrl = urlBuilder.build();

        assertNotNull(outputUrl);
        assertEquals("https://google.com", outputUrl.toString());
    }

}