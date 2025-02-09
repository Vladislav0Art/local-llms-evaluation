package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertNonNullObjectTest {

    @Test
    public void convertNonNullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        ExportOptions exportOptions = new ExportOptions();
        exportOptions.setExportPattern("testPattern");
        String json = transformer.convert(exportOptions);
        assertTrue(json.contains("\"exportPattern\":\"testPattern\""));
    }

}