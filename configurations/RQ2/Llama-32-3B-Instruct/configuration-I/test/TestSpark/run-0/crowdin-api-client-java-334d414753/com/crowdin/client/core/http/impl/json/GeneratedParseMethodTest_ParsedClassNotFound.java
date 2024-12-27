package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedParseMethodTest_ParsedClassNotFound {

    private JacksonJsonTransformer transformer;

    @Test
    public void parseMethodTest_ParsedClassNotFound() throws Exception {
        Field field = JacksonJsonTransformer.class.getDeclaredField("parse");
        field.setAccessible(true);
        Object result = field.get(transformer);
        assertEquals(null, result);
    }

}