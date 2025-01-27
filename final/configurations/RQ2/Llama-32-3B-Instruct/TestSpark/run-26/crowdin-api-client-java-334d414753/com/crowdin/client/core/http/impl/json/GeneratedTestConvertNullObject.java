package com.crowdin.client.core.http.impl.json;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedTestConvertNullObject {

    private JacksonJsonTransformer jsonJsonTransformer;

    @Before
    public void setup() {
        jsonJsonTransformer = new JacksonJsonTransformer();
    }

    @Test
    public void testConvertNullObject() {
        Project project = null;
        assertThrows(HttpBadRequestException.class, () -> jsonJsonTransformer.convert(project));
    }

}