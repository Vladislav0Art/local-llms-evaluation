package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedIsKnownTag_ValidTagName_ReturnsKnownStatus {

    @Test
    public void isKnownTag_ValidTagName_ReturnsKnownStatus() throws Exception {
        String tagName = "img";
        boolean expectedKnown = true;
        Method method = Tag.class.getMethod("isKnownTag", String.class);
        assertEquals(expectedKnown, (boolean) method.invoke(null, tagName));
    }

}