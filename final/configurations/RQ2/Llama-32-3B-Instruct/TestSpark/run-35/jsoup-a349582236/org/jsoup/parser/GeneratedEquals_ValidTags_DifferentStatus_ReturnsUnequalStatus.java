package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedEquals_ValidTags_DifferentStatus_ReturnsUnequalStatus {

    @Test
    public void equals_ValidTags_DifferentStatus_ReturnsUnequalStatus() throws Exception {
        String tagName1 = "div";
        String tagName2 = "span";
        boolean expectedEqual = false;
        Method method = Tag.class.getMethod("equals", Object.class);
        assertFalse((boolean) method.invoke(null, tagName1, tagName2));
    }

}