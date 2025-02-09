package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedEquals_ValidTags_ReturnsEqualStatus {

    @Test
    public void equals_ValidTags_ReturnsEqualStatus() throws Exception {
        String tagName1 = "div";
        String tagName2 = "div";
        boolean expectedEqual = true;
        Method method = Tag.class.getMethod("equals", Object.class);
        assertTrue((boolean) method.invoke(null, tagName1, tagName2));
    }

}