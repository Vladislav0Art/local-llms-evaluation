package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendToAsciiSpaceAsPercent20Test {

    @Test
    public void appendToAsciiSpaceAsPercent20Test() throws Exception {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("Test Test", false, sb);
        Assert.assertEquals("Test%20Test", sb.toString());
    }

}