package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConvertExportOptionsToStringTest {

    @Mock
    private com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @Test
    public void convertExportOptionsToStringTest() {
        ExportOptions exportOptions = new ExportOptions();
        exportOptions.setFileFormat(1L);
        exportOptions.setProjectId(2L);

        String result = (String) JsonTransformer.convert(exportOptions);

        assertFalse(result.isEmpty());
    }

}