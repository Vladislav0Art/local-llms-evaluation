package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertValidObjectTest {

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        TestEntity entity = new TestEntity("test");
        String json = transformer.convert(entity);

        assertTrue(json.contains("\"name\":\"test\""));
    }

}