package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseInvalidJsonTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseInvalidJsonTest() {
        String json = "Invalid json";
        transformer.parse(json, FileInfo.class);
    }

}