package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void parseTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"name\":\"John\",\"age\":30}";
        Person person = transformer.parse(json, Person.class);
        assertEquals("John", person.getName());
        assertEquals(30, person.getAge());
    }

    @Test
    public void convertTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Person person = new Person("John", 30);
        String json = transformer.convert(person);
        assertEquals("{\"name\":\"John\",\"age\":30}", json);
    }

    @Test
    public void parseWithMockTest() {
        JacksonJsonTransformer transformer = Mockito.mock(JacksonJsonTransformer.class);
        String json = "{\"name\":\"John\",\"age\":30}";
        Person person = new Person("John", 30);
        when(transformer.parse(json, Person.class)).thenReturn(person);
        Person result = transformer.parse(json, Person.class);
        assertEquals(person, result);
    }

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