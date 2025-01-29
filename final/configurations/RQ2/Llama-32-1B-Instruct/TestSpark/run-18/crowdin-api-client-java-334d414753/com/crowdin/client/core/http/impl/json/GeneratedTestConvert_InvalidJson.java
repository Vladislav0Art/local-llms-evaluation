package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvert_InvalidJson {

    @Test
    public void testConvert_InvalidJson() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"invalid\"}";
        try {
            convert(json);
            fail("Expected CrowdinApiException");
        } catch (CrowdinApiException e) {
            // expected exception
        }
    }

}