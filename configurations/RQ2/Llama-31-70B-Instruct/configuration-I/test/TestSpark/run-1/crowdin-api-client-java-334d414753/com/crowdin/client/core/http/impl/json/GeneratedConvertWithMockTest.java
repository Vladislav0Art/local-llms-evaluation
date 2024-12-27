package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedConvertWithMockTest {

    @Test
    public void convertWithMockTest() {
        JacksonJsonTransformer transformer = Mockito.mock(JacksonJsonTransformer.class);
        Person person = new Person("John", 30);
        String json = "{\"name\":\"John\",\"age\":30}";
        when(transformer.convert(person)).thenReturn(json);
        String result = transformer.convert(person);
        assertEquals(json, result);
    }

}