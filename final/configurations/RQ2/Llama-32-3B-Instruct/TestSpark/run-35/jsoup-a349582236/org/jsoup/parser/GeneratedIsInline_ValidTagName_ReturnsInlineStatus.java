package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedIsInline_ValidTagName_ReturnsInlineStatus {

    @Test
    public void isInline_ValidTagName_ReturnsInlineStatus() throws Exception {
        String tagName = "span";
        boolean expectedInline = true;
        Method method = Tag.class.getMethod("isInline", String.class);
        assertEquals(expectedInline, (boolean) method.invoke(null, tagName));
    }

}