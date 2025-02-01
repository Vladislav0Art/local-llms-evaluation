package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;
import java.nio.charset.Charset;

public class GeneratedAppendToAsciiTest {

    @Test
    public void appendToAsciiTest() throws Exception {
        StringBuilder sb = new StringBuilder();

        UrlBuilder.appendToAscii("Hello World!", false, sb);

        Assert.assertTrue(sb.toString().contains("Hello%20World%21"));
    }

}