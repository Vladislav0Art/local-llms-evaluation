package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvertObject {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testConvertObject() {
        Object obj = new Object();
        String result = objectMapper.writeValueAsString(obj);
        assertNotNull(result);
        assertEquals("{\"key\":\"value\"}", result);
    }

}