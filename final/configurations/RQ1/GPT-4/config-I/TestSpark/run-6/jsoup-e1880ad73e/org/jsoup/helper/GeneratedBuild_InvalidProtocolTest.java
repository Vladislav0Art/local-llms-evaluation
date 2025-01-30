package org.jsoup.helper;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedBuild_InvalidProtocolTest {

    @Test
    public void build_InvalidProtocolTest() throws MalformedURLException {
        URL inputUrl = new URL("htt://google.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build();
    }

}