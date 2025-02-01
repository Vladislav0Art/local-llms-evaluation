package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendToAsciiSpaceAsPlusTest {

    @Test
    public void appendToAsciiSpaceAsPlusTest() throws Exception {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("Test Test", true, sb);
        Assert.assertEquals("Test+Test", sb.toString());
    }

}