package com.crowdin.client.core.http.impl.json;

public class GeneratedTestNullObjectConversionToJSON {

    public static class StringConvertTest {

        @Test
        public void testNullObjectConversionToJSON() {
            NullObjectToJSONTest.NullObjectToJSONTestTest();
        }

        private void NullObjectToJSONTestTest() {
            String json = "{\"name\":\"John\"}";
            Object obj = JsonTransformer.parse(json, new NonNullStringConvertTest.NonNullStringConvertTest());
            assertNotNull(obj);
            assertEquals("John", (String) obj);
        }
    }

}