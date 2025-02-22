package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildURlWithNullInputUrl {

    @Test
    public void buildURlWithNullInputUrl() {
        try {
            new UrlBuilder(null);
            Assert.fail("Should throw exception on null input url");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

}