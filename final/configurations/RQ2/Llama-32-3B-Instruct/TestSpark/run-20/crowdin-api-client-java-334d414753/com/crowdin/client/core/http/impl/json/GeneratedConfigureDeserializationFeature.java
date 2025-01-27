package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedConfigureDeserializationFeature {

    public static class IncludeNullValues {
    }

    @Mock
    private ObjectMapper objectMapper;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void configureDeserializationFeature() {
        when(objectMapper.configure(MapperFeature.DeserializationFeature, true)).thenReturn(true);
    }

}