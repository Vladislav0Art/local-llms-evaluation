package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;

import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.reflect.Method;
import java.net.URL;

public class GeneratedAppendToAsciiTest_WithError {

    @Test
    public void appendToAsciiTest_WithError() throws Exception {
        StringBuilder sb = new StringBuilder();
        Method appendToAscii = UrlBuilder.class.getDeclaredMethod("appendToAscii", String.class, boolean.class, StringBuilder.class);
        appendToAscii.setAccessible(true);
        appendToAscii.invoke(null, "エンコードされるべき文字列", true, sb); // Exception should be thrown
    }

}