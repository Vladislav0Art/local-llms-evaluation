package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedParseWithMockTest {

    @Test
    public void parseWithMockTest() {
        JacksonJsonTransformer transformer = Mockito.mock(JacksonJsonTransformer.class);
        String json = "{\"name\":\"John\",\"age\":30}";
        Person person = new Person("John", 30);
        when(transformer.parse(json, Person.class)).thenReturn(person);
        Person result = transformer.parse(json, Person.class);
        assertEquals(person, result);
    }

}