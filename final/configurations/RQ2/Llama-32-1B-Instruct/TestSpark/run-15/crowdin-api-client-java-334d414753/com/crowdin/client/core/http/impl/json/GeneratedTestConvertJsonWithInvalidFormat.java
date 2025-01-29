package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTestConvertJsonWithInvalidFormat {

    @Test
    public void testConvertJsonWithInvalidFormat() throws JsonProcessingException {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"Not a number\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(json, null);
        } catch (JsonProcessingException e) {
            assertEquals("Name must be a non-null string", e.getMessage());
        }
    }

    public class Project {

        private String name;
        private int age;

        public String getName() throws JsonProcessingException {
            return this.name;
        }

        public void setName(String name) throws JsonProcessingException {
            if (this.name == null || this.name.isEmpty()) {
                throw new JsonProcessingException("Name must be a non-null string");
            }
            this.name = name;
        }

        public int getAge() throws JsonProcessingException {
            return this.age;
        }

        public void setAge(int age) throws JsonProcessingException {
            if (this.age == null || this.age < 0) {
                throw new JsonProcessingException("Age must be a non-negative integer");
            }
            this.age = age;
        }
    }

}