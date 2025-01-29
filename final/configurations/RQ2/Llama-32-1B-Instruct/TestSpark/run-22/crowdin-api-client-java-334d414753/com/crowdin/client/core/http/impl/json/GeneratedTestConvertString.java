package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvertString {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testConvertString() {
        String json = "{\"key\":\"value\"}";
        String result = objectMapper.writeValueAsString(json);
        assertNotNull(result);
        assertEquals("{\"key\":\"value\"}", result);
    }

}