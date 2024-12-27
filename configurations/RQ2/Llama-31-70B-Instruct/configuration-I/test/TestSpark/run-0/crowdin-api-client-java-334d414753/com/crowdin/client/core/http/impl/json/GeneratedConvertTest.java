package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedConvertTest {

    @Test
    public void convertTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Person person = new Person("John", 30);
        String json = transformer.convert(person);
        assertEquals("{\"name\":\"John\",\"age\":30}", json);
    }

}