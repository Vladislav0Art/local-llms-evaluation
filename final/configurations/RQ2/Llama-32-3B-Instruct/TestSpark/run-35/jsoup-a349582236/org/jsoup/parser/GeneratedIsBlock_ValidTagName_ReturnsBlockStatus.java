package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedIsBlock_ValidTagName_ReturnsBlockStatus {

    @Test
    public void isBlock_ValidTagName_ReturnsBlockStatus() throws Exception {
        String tagName = "p";
        boolean expectedBlock = false;
        Method method = Tag.class.getMethod("isBlock", String.class);
        assertEquals(expectedBlock, (boolean) method.invoke(null, tagName));
    }

}