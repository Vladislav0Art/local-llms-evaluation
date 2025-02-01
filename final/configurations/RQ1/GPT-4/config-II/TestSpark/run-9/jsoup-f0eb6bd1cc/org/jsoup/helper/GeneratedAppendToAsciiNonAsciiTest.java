package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.URL;
import java.net.URLEncoder;

public class GeneratedAppendToAsciiNonAsciiTest {

    @Test
    public void appendToAsciiNonAsciiTest() throws Exception {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("é", false, sb);

        Assert.assertEquals(URLEncoder.encode("é", "UTF-8"), sb.toString());
    }

}