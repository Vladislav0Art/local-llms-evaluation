package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.fasterxml.jackson.core.JsonParseException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.crowdin.client.core.http.impl.json.JsonTransformer;

public class GeneratedConvertNullObjectTest {

    @Test
    public void convertNullObjectTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = transformer.convert(null);
        assertNull(json);
    }

    class TestObject {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}