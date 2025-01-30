package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;

import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.reflect.Method;
import java.net.URL;

public class GeneratedAppendToAsciiTest {

    @Test
    public void appendToAsciiTest() throws Exception {
        StringBuilder sb = new StringBuilder();
        Method appendToAscii = UrlBuilder.class.getDeclaredMethod("appendToAscii", String.class, boolean.class, StringBuilder.class);
        appendToAscii.setAccessible(true);
        appendToAscii.invoke(null, "ascii text 123", false, sb);
        assertEquals("ascii+text+123", sb.toString());
    }

}