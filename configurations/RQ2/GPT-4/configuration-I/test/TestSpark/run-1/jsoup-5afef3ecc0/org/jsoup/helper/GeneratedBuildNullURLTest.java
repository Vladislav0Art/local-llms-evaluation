package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildNullURLTest {

    @Test
    public void buildNullURLTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);

        urlBuilder.build();
    }

}