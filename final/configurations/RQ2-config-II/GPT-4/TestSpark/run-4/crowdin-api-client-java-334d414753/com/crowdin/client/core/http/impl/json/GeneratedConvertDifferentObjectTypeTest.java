package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedConvertDifferentObjectTypeTest {

    @Test
    public void convertDifferentObjectTypeTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        ExportOptions options = new ExportOptions();
        options.setSkipUntranslatedStrings(true);
        options.setExportApprovedOnly(true);

        String json = transformer.convert(options);
        assertNotNull(json);
        assertEquals("{\"exportApprovedOnly\":true,\"skipUntranslatedStrings\":true}", json);
    }

}