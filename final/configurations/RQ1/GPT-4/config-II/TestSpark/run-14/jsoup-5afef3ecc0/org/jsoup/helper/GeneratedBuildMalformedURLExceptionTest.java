package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedBuildMalformedURLExceptionTest {

    @Test
    public void buildMalformedURLExceptionTest() throws Exception {
        URL url = new URL("abc://def");
        UrlBuilder builder = new UrlBuilder(url);
        builder.build();
    }

}