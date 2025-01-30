package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;
import org.junit.Test;

import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

public class GeneratedDecodePartTest {

    @Test
    public void decodePartTest() throws Exception {
        URL u = new URL("http://exámple.com");
        UrlBuilder builder = new UrlBuilder(u);
        builder.decodePart("invalid input");
    }

}