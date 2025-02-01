package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.URL;
import java.net.URLEncoder;

public class GeneratedAppendToAsciiAsciiTest {

    @Test
    public void appendToAsciiAsciiTest() throws Exception {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("a", false, sb);

        Assert.assertEquals("a", sb.toString());
    }

}