package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildWhenUrlIsNullTest {

    @Test
    public void buildWhenUrlIsNullTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(null);

        URL builtUrl = urlBuilder.build();
    }

}