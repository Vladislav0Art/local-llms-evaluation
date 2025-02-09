package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedValueOf_ValidTagName_ReturnsTag {

    @Test
    public void valueOf_ValidTagName_ReturnsTag() throws Exception {
        String tagName = "img";
        Object expectedTag = new Object();
        Method method = Tag.class.getMethod("valueOf", String.class);
        assertSame(expectedTag, (Object) method.invoke(null, tagName));
    }

}