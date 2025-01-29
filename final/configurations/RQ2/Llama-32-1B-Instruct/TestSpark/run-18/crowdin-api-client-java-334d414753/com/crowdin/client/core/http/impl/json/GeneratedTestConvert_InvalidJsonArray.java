package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvert_InvalidJsonArray {

    @Test
    public void testConvert_InvalidJsonArray() {
        String json = "[{\"name\":\"John\",\"age\":30,\"city\":\"invalid\"}]";
        try {
            convert(json);
            fail("Expected CrowdinApiException");
        } catch (CrowdinApiException e) {
            // expected exception
        }
    }

}