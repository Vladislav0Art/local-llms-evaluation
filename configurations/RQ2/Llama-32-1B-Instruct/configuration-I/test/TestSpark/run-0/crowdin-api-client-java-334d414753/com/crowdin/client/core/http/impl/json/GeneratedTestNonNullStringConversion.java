package com.crowdin.client.core.http.impl.json;

public class GeneratedTestNonNullStringConversion {

    public static class StringConvertTest {

        @Test
        public void testNonNullStringConversion() {
            NonNullStringConvertTest.NonNullStringConvertTestTest();
        }

        private void NonNullStringConvertTestTest() {
            String json = "{\"name\":\"John\"}";
            Object obj = JsonTransformer.parse(json, String.class);
            assertNotNull(obj);
            assertEquals("John", (String) obj);
        }
    }

    public static class NullStringParseTest {
        @Before
        public void setup() {
            JacksonJsonTransformer.mockObj(JsonTransformer::parse).withAnyArguments();
        }

        @After
        public void tearDown() {
            JacksonJsonTransformer.mockObj(JsonTransformer::parse).withAnyArguments();
        }

    }