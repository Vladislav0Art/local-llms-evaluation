package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.ImportOptions;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GeneratedParseValidJsonTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String validJson = "{\"option\":\"test_option\",\"translationKey\":\"test_key\"}";
        ImportOptions importOptions = transformer.parse(validJson, ImportOptions.class);
        Assert.assertEquals("test_option", importOptions.getOption());
        Assert.assertEquals("test_key", importOptions.getTranslationKey());
    }

}