package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

public class GeneratedBuildMalformedURLExceptionTest {

    @Test
    public void buildMalformedURLExceptionTest() throws Exception {
        URL url = new URL("sampleUrl");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

}