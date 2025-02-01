package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertValidObjectTest {

    @Test
    public void convertValidObjectTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setName("Test Project");
        String convertedString = transformer.convert(project);
        assertTrue(convertedString.contains("Test Project"));
    }

}