package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedConvertMethodTest_ValidJsonObject {

    private JacksonJsonTransformer transformer;

    @Test
    public void convertMethodTest_ValidJsonObject() throws Exception {
        Field field = JacksonJsonTransformer.class.getDeclaredField("convert");
        field.setAccessible(true);
        Object result = field.get(transformer);
        assertNotNull(result);
    }

}