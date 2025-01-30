package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;

import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.reflect.Method;
import java.net.URL;

public class GeneratedDecodePartTest_WithError {

    @Test
    public void decodePartTest_WithError() throws Exception {
        Method decodePart = UrlBuilder.class.getDeclaredMethod("decodePart", String.class);
        decodePart.setAccessible(true);
        decodePart.invoke(null, "エンコードされるべき%20文字列"); // Exception should be thrown
    }

}