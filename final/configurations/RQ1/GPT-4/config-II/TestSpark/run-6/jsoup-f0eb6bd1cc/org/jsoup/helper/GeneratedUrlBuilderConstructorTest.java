package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void UrlBuilderConstructorTest() throws Exception {
        URL url = new URL("http://www.google.com");
        UrlBuilder builder = new UrlBuilder(url);
        assertNotNull(builder);
    }

}