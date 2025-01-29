package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformerImpl;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;

public class GeneratedTestConvertBooleanToBoolean {

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
            public void testConvertBooleanToBoolean() {
                boolean b = true;
                Object result = convert(b);
                if (result != null && (b instanceof Boolean)) {
                    assertTrue((Boolean) result);
                }
            }
        }
    }

    public static class Project {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}