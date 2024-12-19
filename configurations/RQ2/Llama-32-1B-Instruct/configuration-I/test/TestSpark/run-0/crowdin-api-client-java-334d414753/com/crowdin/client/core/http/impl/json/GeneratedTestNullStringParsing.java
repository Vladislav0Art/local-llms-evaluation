package com.crowdin.client.core.http.impl.json;

public class GeneratedTestNullStringParsing {

    public static class StringConvertTest {

        @Test
        public void testNullStringParsing() {
            NullStringParseTest.NullStringParseTestTest();
        }

        private void NullStringParseTestTest() {
            String json = "{\"name\":\"John\"}";
            Object obj = JsonTransformer.parse(json, null);
            assertThrows(NullPointerException.class, () -> (String) obj);
        }
    }

    public static class NullObjectToJSONTest {
        @Before
        public void setup() {
            JacksonJsonTransformer.mockObj(JsonTransformer::parse).withAnyArguments();
        }

        @After
        public void tearDown() {
            JacksonJsonTransformer.mockObj(JsonTransformer::parse).withAnyArguments();
        }

    }