package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTestParse_InvalidJsonString {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testParse_InvalidJsonString() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\" invalid\"}";
        try {
            objectMapper.writeValue(java.util.Arrays.asList(1, 2, 3), json);
            fail("Expected CrowdinApiException");
        } catch (CrowdinApiException e) {
            // expected exception
        }
    }

}