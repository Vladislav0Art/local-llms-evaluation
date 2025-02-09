package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseJsonWithUnexpectedFieldTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseJsonWithUnexpectedFieldTest() {
        String json = "{\"unexpected_field\": \"unexpected_value\"}";
        transformer.parse(json, FileInfo.class);
    }

}