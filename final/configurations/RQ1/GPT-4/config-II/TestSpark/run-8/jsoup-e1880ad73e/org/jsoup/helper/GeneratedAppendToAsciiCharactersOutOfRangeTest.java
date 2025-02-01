package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedAppendToAsciiCharactersOutOfRangeTest {

    @Test
    public void appendToAsciiCharactersOutOfRangeTest() throws Exception {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("\u20AC", false, sb);
        Assert.assertNotEquals("\u20AC", sb.toString());
    }

}