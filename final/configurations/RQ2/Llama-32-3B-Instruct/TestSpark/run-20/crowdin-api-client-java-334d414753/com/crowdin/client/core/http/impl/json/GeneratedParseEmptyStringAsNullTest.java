package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedParseEmptyStringAsNullTest {

    public static class IncludeNullValues {
    }

    @Mock
    private ObjectMapper objectMapper;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void parseEmptyStringAsNullTest() {
        String json = "";
        Class<?> clazz = null;
        Object result = new JacksonJsonTransformer().parse(json, clazz);
        assertThat(result, is(null));
    }

}