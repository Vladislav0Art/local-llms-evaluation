package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class GeneratedUrlBuilderAppendToAscii {

    @Test
    public void urlBuilderAppendToAscii() throws Exception {
        String stringToEncode = "æøæ";
        boolean spaceAsPlus = true;
        StringBuilder sb = new StringBuilder();
        Method method = UrlBuilder.class.getDeclaredMethod("appendToAscii", String.class, boolean.class, StringBuilder.class);
        method.setAccessible(true);
        method.invoke(null, stringToEncode, spaceAsPlus, sb);

        assertEquals("%C3%A6%C3%B8%C3%A6", sb.toString());
    }

}