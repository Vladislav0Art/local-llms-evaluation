package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedIsSelfClosing_ValidTagName_ReturnsSelfClosingStatus {

    @Test
    public void isSelfClosing_ValidTagName_ReturnsSelfClosingStatus() throws Exception {
        String tagName = "img";
        boolean expectedSelfClosing = true;
        Method method = Tag.class.getMethod("isSelfClosing", String.class);
        assertEquals(expectedSelfClosing, (boolean) method.invoke(null, tagName));
    }

}