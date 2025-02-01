package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedBuildInvalidProtocolTest {

    @Test
    public void buildInvalidProtocolTest() throws Exception {
        URL url = new URL("ht://test.com:8080/temp/index.html?param=value#section");

        UrlBuilder urlBuilder = new UrlBuilder(url);

        urlBuilder.build();
    }

}