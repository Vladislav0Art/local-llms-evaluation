package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformerImpl;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;

public class GeneratedTestConvertStringToDouble {

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
            public void testConvertStringToDouble() {
                String s = "12.5";
                double result = convert(s);
                assertEquals(12.5, result);
            }

        }