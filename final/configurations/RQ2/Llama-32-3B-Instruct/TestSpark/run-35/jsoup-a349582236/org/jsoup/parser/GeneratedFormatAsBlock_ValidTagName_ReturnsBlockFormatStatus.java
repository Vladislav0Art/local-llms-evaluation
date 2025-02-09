package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedFormatAsBlock_ValidTagName_ReturnsBlockFormatStatus {

    @Test
    public void formatAsBlock_ValidTagName_ReturnsBlockFormatStatus() throws Exception {
        String tagName = "p";
        boolean expectedBlockFormat = false;
        Method method = Tag.class.getMethod("formatAsBlock", String.class);
        assertEquals(expectedBlockFormat, (boolean) method.invoke(null, tagName));
    }

}