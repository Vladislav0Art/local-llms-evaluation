package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformerImpl;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;

public class GeneratedTestConvertNumberToInt {

    public static class JsonValue {
        @PropertyAccessor
        private String json;

        public String getJson() {
            return json;
        }

        public void setJson(String json) {
            this.json = json;
        }

        public Object convert(Object obj) {
            if (obj instanceof String) {
                return String.valueOf(obj);
            } else if (obj instanceof Number || obj instanceof Boolean) {
                return obj;
            } else if (obj instanceof List) {
                return new ArrayList<>();
            } else {
                return null;
            }
        }

        public static class Test extends GeneratedTest {

            @Test
            public void testConvertNumberToInt() {
                int i = 123;
                Object[] array = (Object[]) convert(i);
                if (array != null && ((Number) array[0]).intValue() == i) {
                    assertEquals(1, ((Number) array[0]).intValue());
                }
            }

        }