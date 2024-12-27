package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedParseTest {

    @Test
    public void parseTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"name\":\"John\",\"age\":30}";
        Person person = transformer.parse(json, Person.class);
        assertEquals("John", person.getName());
        assertEquals(30, person.getAge());
    }

}