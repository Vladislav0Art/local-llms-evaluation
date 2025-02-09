package org.jsoup.helper;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedBuildInvalidUrlTest {

    @Test
    public void buildInvalidUrlTest() throws Exception {
        URL url = new URL("http://");
        UrlBuilder builder = new UrlBuilder(url);
        builder.build();
    }

}