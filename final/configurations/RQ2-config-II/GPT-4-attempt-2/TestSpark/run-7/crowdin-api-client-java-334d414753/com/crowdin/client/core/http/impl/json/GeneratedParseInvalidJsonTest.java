package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.ImportOptions;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GeneratedParseInvalidJsonTest {

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String invalidJson = "invalid-json";
        transformer.parse(invalidJson, ImportOptions.class);
    }

}