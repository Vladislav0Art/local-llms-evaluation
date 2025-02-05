package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedConvertValidObjectTest {

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        TestClass testObject = new TestClass();
        testObject.setTestField("testValue");
        String result = transformer.convert(testObject);

        assertEquals("{\"testField\":\"testValue\"}", result);
    }
}

}