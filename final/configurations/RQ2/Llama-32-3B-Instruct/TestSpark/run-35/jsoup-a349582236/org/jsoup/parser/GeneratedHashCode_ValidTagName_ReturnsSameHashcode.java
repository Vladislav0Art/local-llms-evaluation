package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedHashCode_ValidTagName_ReturnsSameHashcode {

    @Test
    public void hashCode_ValidTagName_ReturnsSameHashcode() throws Exception {
        String tagName1 = "div";
        String tagName2 = "div";
        int expectedHashcode = 12345;
        Method method = Tag.class.getMethod("hashCode", String.class);
        assertEquals(expectedHashcode, (int) method.invoke(null, tagName1));
    }

}