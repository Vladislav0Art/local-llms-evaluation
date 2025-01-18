package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.ExportOptions;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedParseSuccessTest {

    @Test
    public void parseSuccessTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        ExportOptions options = new ExportOptions();
        try {
            options = transformer.parse("Valid Json", ExportOptions.class);
        } catch (Exception e) {
            assertEquals("Parsing succeeded", e.getMessage());
        }
    }

}