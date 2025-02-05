package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class GeneratedConvertEmptyObjectTest {

    @Test
    public void convertEmptyObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        HashMap emptyObject = new HashMap();
        String result = transformer.convert(emptyObject);
        Assert.assertEquals("{}", result);
    }

}