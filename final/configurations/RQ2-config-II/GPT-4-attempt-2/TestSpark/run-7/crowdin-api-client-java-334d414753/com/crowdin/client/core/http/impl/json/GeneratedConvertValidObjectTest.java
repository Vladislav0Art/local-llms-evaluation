package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.ImportOptions;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GeneratedConvertValidObjectTest {

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        ImportOptions importOptions = new ImportOptions();
        importOptions.setOption("test_option");
        importOptions.setTranslationKey("test_key");
        String result = transformer.convert(importOptions);
        Assert.assertEquals("{\"option\":\"test_option\",\"translationKey\":\"test_key\"}", result);
    }

}