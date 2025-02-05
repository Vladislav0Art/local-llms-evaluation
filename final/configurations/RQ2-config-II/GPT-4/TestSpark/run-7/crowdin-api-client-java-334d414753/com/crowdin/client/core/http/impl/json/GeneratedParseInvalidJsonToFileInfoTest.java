package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParseInvalidJsonToFileInfoTest {

    @Test
    public void parseInvalidJsonToFileInfoTest() {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        String json = "{\"incompleteJson\":}";
        jacksonJsonTransformer.parse(json, FileInfo.class);
    }

}