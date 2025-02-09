package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedIsFormListed_ValidTagName_ReturnsFormListedStatus {

    @Test
    public void isFormListed_ValidTagName_ReturnsFormListedStatus() throws Exception {
        String tagName = "form";
        boolean expectedFormListed = true;
        Method method = Tag.class.getMethod("isFormListed", String.class);
        assertEquals(expectedFormListed, (boolean) method.invoke(null, tagName));
    }

}