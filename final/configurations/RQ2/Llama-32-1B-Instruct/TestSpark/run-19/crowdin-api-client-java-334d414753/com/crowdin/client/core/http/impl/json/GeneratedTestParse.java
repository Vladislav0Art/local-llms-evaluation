package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformerImpl;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class GeneratedTestParse {

    @Test
    public void testParse() {
        String json = "{\"name\":\"project\",\"id\":1}";
        JacksonJsonTransformerImpl transformer = new JacksonJsonTransformerImpl();
        assertNotNull(transformer.convert(json, Project.class));
    }

}