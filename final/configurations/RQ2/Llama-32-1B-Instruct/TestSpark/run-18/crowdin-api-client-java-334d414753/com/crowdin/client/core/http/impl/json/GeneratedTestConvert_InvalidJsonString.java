package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTestConvert_InvalidJsonString {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testConvert_InvalidJsonString() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\" invalid\"}";
        try {
            convert(json, "JSONParser");
            fail("Expected CrowdinApiException");
        } catch (CrowdinApiException e) {
            // expected exception
        }
    }

}