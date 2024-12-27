package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedConvertMethodTest_NullObject {

    private JacksonJsonTransformer transformer;

    @Test
    public void convertMethodTest_NullObject() throws Exception {
        Field field = JacksonJsonTransformer.class.getDeclaredField("convert");
        field.setAccessible(true);
        Object result = field.get(transformer);
        assertEquals("", result);
    }

}