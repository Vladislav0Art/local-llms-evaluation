package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.lang.reflect.Type;

public class GeneratedParseImportOptions {

    @Mock
    private com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    public com.crowdin.client.core.http.impl.json.JacksonJsonTransformer jsonTransformer = new com.crowdin.client.core.http.impl.json.JacksonJsonTransformer();

    @org.junit.Before
    public void setup() {
        org.hamcrest.MatcherAssert.assertThat = org.hamcrest.Matchers.is;
    }

    @Test
    public void parseImportOptions() throws Exception {
        when(com.fasterxml.jackson.databind.ObjectMapper.findAndRegisterModules()).thenReturn(com.fasterxml.jackson.databind.SimpleModule.class);

        com.crowdin.client.core.http.impl.json.ImportOptions importOptions = new com.crowdin.client.core.http.impl.json.ImportOptions();
        String json = "{\"source_type\": \"github\"}";
        Object result = jsonTransformer.parse(json, com.crowdin.client.core.http.impl.json.ImportOptions.class);
        org.junit.Assert.assertTrue(result == null);
    }

}