package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedValueOf_ValidTagName_ParsedSettings_ReturnsParsedTag {

    @Test
    public void valueOf_ValidTagName_ParsedSettings_ReturnsParsedTag() throws Exception {
        String tagName = "div";
        ParseSettings settings = new ParseSettings();
        Object expectedTag = new Object();
        Method method = Tag.class.getMethod("valueOf", String.class, ParseSettings.class);
        assertSame(expectedTag, (Object) method.invoke(null, tagName, settings));
    }

}