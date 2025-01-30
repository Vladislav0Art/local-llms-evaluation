package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedBuildWithPunycodeDomainTest {

    @Test
    public void buildWithPunycodeDomainTest() throws Exception {
        URL url = new URL("http://www.äëïöü.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertTrue(urlBuilder.build().toString().contains("xn--"));
    }

}