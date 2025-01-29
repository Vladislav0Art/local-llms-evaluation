package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTestParse_InvalidJson {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testParse_InvalidJson() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\" invalid\"}";
        try {
            objectMapper.writeValue(java.util.Arrays.asList(1, 2, 3), json);
            fail("Expected CrowdinApiException");
        } catch (CrowdinApiException e) {
            // expected exception
        }
    }

}