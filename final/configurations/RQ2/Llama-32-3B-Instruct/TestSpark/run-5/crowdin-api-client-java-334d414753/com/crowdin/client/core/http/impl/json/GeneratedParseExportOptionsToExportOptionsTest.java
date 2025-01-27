package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseExportOptionsToExportOptionsTest {

    @Mock
    private com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @Test
    public void parseExportOptionsToExportOptionsTest() {
        ExportOptions exportOptions = new ExportOptions();
        exportOptions.setFileFormat(1L);
        exportOptions.setProjectId(2L);
        String json = (String) com.fasterxml.jackson.databind.JsonNode.toJson(exportOptions);

        assertTrue(JsonTransformer.parse(json, ExportOptions.class) instanceof ExportOptions);
    }

}