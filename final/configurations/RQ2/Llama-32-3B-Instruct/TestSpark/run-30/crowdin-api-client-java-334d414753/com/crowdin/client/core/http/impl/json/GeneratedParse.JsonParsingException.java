package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.core.http.impl.json.JsonTransformer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParse.

JsonParsingException {

    @Mock
    private ObjectMapper mapper;

    @Mock
    private SimpleModule module;

    @Test
    public void parse.JsonParsingException() {
        when(mapper.findAndRegisterModules()).thenReturn(module);
        when(mapper.convertValue(any(), any())).thenThrow(new RuntimeException("EXCEPTION"));
        String json = "{\"key\":\"value\"}";
        Class<Project> clazz = Project.class;
        try {
            JacksonJsonTransformer.parse(json, clazz);
            assert false;
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), "EXCEPTION");
        }
    }

}