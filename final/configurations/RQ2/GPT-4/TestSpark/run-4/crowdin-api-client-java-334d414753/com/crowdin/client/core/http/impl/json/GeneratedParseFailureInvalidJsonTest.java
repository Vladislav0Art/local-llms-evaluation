package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.ExportOptions;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedParseFailureInvalidJsonTest {

    @Test
    public void parseFailureInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        ExportOptions options = null;
        try {
            options = transformer.parse("Invalid Json", ExportOptions.class);
        } catch (Exception e) {
            assertEquals("Failed to parse the json", e.getMessage());
        }
    }

}