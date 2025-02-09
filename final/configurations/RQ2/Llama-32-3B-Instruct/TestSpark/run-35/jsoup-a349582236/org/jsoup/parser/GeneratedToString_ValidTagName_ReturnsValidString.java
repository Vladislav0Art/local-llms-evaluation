package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedToString_ValidTagName_ReturnsValidString {

    @Test
    public void toString_ValidTagName_ReturnsValidString() throws Exception {
        String tagName = "div";
        String expectedString = "<div></div>";
        Method method = Tag.class.getMethod("toString", String.class);
        assertEquals(expectedString, (String) method.invoke(null, tagName));
    }

}