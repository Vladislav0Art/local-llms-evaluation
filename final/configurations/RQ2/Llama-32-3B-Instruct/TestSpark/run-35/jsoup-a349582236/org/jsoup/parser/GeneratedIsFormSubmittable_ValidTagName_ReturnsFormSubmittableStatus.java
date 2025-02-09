package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GeneratedIsFormSubmittable_ValidTagName_ReturnsFormSubmittableStatus {

    @Test
    public void isFormSubmittable_ValidTagName_ReturnsFormSubmittableStatus() throws Exception {
        String tagName = "form";
        boolean expectedFormSubmittable = true;
        Method method = Tag.class.getMethod("isFormSubmittable", String.class);
        assertEquals(expectedFormSubmittable, (boolean) method.invoke(null, tagName));
    }

}