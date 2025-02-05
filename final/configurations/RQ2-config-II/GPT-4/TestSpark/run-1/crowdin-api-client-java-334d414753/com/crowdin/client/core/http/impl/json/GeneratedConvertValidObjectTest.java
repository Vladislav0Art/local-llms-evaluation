package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class GeneratedConvertValidObjectTest {

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        HashMap<String, String> validObject = new HashMap<>();
        validObject.put("key", "value");
        String result = transformer.convert(validObject);
        Assert.assertEquals("{\"key\":\"value\"}", result);
    }

}