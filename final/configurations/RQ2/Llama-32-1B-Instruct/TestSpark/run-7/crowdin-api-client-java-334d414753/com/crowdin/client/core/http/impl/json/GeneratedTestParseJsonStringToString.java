package com.crowdin.client.core.http.impl.json;

public class GeneratedTestParseJsonStringToString {

    @Test
    public void TestParseJsonStringToString() throws Exception {
        String jsonStr = "{\"name\":\"test\",\"id\":123}";
        String result = new JacksonJsonTransformer().parse(jsonStr, String.class);
        assertEquals("test", result);
    }

}