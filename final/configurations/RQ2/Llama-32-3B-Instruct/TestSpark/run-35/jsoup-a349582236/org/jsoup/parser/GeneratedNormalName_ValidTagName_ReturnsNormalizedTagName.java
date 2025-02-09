package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedNormalName_ValidTagName_ReturnsNormalizedTagName {

    @Test
    public void normalName_ValidTagName_ReturnsNormalizedTagName() throws Exception {
        String tagName = "div";
        String expectedNormalName = "div";
        Method method = Tag.class.getMethod("normalName", String.class);
        assertEquals(expectedNormalName, (String) method.invoke(null, tagName));
    }

}