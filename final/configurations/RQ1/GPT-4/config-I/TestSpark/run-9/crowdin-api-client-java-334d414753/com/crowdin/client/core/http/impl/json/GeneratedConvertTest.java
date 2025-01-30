package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertTest {

    @Test
    public void convertTest() {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

        Object obj = new Object();
        String result = jacksonJsonTransformer.convert(obj);
        assertNotNull(result);

        obj = null;
        result = jacksonJsonTransformer.convert(obj);
        assertNull(result);
    }

}