package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendToAsciiCharactersInRangeTest {

    @Test
    public void appendToAsciiCharactersInRangeTest() throws Exception {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("Test", false, sb);
        Assert.assertEquals("Test", sb.toString());
    }

}