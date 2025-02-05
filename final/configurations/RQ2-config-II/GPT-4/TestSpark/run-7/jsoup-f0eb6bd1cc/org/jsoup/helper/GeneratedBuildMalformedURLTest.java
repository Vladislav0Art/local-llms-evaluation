package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedBuildMalformedURLTest {

    @Test
    public void buildMalformedURLTest() {
        try {
            URL inputUrl = new URL("^malformed.url");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            URL resultUrl = urlBuilder.build();
        } catch (Exception e) {
            throw new MalformedURLException();
        }
    }

}