package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.ImportOptions;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GeneratedTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String validJson = "{\"option\":\"test_option\",\"translationKey\":\"test_key\"}";
        ImportOptions importOptions = transformer.parse(validJson, ImportOptions.class);
        Assert.assertEquals("test_option", importOptions.getOption());
        Assert.assertEquals("test_key", importOptions.getTranslationKey());
    }

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String invalidJson = "invalid-json";
        transformer.parse(invalidJson, ImportOptions.class);
    }

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        ImportOptions importOptions = new ImportOptions();
        importOptions.setOption("test_option");
        importOptions.setTranslationKey("test_key");
        String result = transformer.convert(importOptions);
        Assert.assertEquals("{\"option\":\"test_option\",\"translationKey\":\"test_key\"}", result);
    }

    @Test
    public void convertInvalidObjectTest() {
        Object invalidObject = new SimpleDateFormat();
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.convert(invalidObject);
    }

}