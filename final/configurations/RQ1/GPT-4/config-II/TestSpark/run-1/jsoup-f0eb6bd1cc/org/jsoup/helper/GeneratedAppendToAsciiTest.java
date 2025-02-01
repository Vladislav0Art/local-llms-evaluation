package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class GeneratedAppendToAsciiTest {

    @Test
    public void appendToAsciiTest() throws Exception {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.class.getDeclaredMethod("appendToAscii", String.class, boolean.class, StringBuilder.class)
                .invoke(null, "测试", false, sb);
        Assert.assertEquals("%E6%B5%8B%E8%AF%95", sb.toString());
    }

}