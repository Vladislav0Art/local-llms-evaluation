package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;

import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.reflect.Method;
import java.net.URL;

public class GeneratedDecodePartTest {

    @Test
    public void decodePartTest() throws Exception {
        Method decodePart = UrlBuilder.class.getDeclaredMethod("decodePart", String.class);
        decodePart.setAccessible(true);
        String decoded = (String) decodePart.invoke(null, "This%20should%20be%20decoded");
        assertEquals("This should be decoded", decoded);
    }

}