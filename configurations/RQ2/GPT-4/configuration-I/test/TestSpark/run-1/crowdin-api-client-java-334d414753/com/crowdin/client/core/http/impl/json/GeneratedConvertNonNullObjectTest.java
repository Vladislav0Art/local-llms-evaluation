package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.fasterxml.jackson.core.JsonParseException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.crowdin.client.core.http.impl.json.JsonTransformer;

public class GeneratedConvertNonNullObjectTest {

    @Test
    public void convertNonNullObjectTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        TestObject testObject = new TestObject();
        testObject.setName("test-name");

        String json = transformer.convert(testObject);
        assertNotNull(json);
        assertEquals("{\"name\":\"test-name\"}", json);
    }

}