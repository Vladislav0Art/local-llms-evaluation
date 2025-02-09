package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedIsEmpty_ValidTagName_ReturnsEmptyStatus {

    @Test
    public void isEmpty_ValidTagName_ReturnsEmptyStatus() throws Exception {
        String tagName = "img";
        boolean expectedEmpty = false;
        Method method = Tag.class.getMethod("isEmpty", String.class);
        assertEquals(expectedEmpty, (boolean) method.invoke(null, tagName));
    }

}