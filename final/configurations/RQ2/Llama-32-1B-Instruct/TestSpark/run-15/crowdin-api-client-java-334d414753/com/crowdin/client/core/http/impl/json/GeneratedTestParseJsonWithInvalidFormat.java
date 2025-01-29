package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTestParseJsonWithInvalidFormat {

    @Test
    public void testParseJsonWithInvalidFormat() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"Not a number\","
    }";
    ObjectMapper objectMapper = new ObjectMapper();
		try

    {
        objectMapper.readValue(json, Project.class);
    } catch(
    JsonProcessingException e)

    {
        assertEquals("Name must be a non-null string", e.getMessage());
    }
}

}