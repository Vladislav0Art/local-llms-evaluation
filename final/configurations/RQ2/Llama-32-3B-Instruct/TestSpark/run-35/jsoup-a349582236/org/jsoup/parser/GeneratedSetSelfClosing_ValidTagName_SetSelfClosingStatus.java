package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedSetSelfClosing_ValidTagName_SetSelfClosingStatus {

    @Test
    public void setSelfClosing_ValidTagName_SetSelfClosingStatus() throws Exception {
        String tagName = "img";
        boolean expectedSelfClosing = true;
        Method method = Tag.class.getMethod("setSelfClosing", String.class);
        assertTrue((Boolean) method.invoke(null, tagName));
    }

}