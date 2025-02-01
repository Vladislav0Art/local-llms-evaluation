package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.Connection;

import java.net.URL;
import java.net.URLEncoder;

public class GeneratedAppendToAsciiSpaceTest {

    @Test
    public void appendToAsciiSpaceTest() throws Exception {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii(" ", true, sb);

        Assert.assertEquals("+", sb.toString());
    }

}